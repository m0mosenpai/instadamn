package X;

import android.R;
import android.text.method.KeyListener;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: classes11.dex */
public final class WKk implements ActionMode.Callback {
    public final /* synthetic */ UDV A00;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public WKk(UDV udv) {
        this.A00 = udv;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        UDV udv = this.A00;
        KeyListener keyListener = UDV.A0V;
        if (udv.A0E) {
            return false;
        }
        menu.removeItem(R.id.pasteAsPlainText);
        return true;
    }
}
