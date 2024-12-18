package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;

/* renamed from: X.WKw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class MenuItemOnMenuItemClickListenerC70225WKw implements MenuItem.OnMenuItemClickListener, View.OnCreateContextMenuListener {
    public final Preference A00;

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Preference preference = this.A00;
        CharSequence A03 = preference.A03();
        if (preference.A0J && !TextUtils.isEmpty(A03)) {
            contextMenu.setHeaderTitle(A03);
            contextMenu.add(0, 0, 0, 2131956832).setOnMenuItemClickListener(this);
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Preference preference = this.A00;
        Context context = preference.A0a;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        CharSequence A03 = preference.A03();
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", A03));
        Toast.makeText(context, AbstractC167007dF.A0f(context, A03, 2131969901), 0).show();
        return true;
    }

    public MenuItemOnMenuItemClickListenerC70225WKw(Preference preference) {
        this.A00 = preference;
    }
}
