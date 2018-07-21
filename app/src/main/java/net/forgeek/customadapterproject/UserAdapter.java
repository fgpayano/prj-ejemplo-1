package net.forgeek.customadapterproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, List<User> users) {
        super(context, 0, users);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent)
    {
        User user = getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parent, false);
        }

        TextView name = convertView.findViewById(R.id.name);
        TextView address = convertView.findViewById(R.id.address);

        name.setText(user.getName());
        address.setText(user.getAddress());

        return convertView;
    }

}
