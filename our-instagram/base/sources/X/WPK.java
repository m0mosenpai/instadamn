package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class WPK implements XDW {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final ArrayList A03 = new ArrayList();
    public final C005001p A02 = new C005001p(0);

    public final UA0 A00(VK7 vk7) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UA0 ua0 = (UA0) arrayList.get(i);
            if (ua0 != null && ua0.A01 == vk7) {
                return ua0;
            }
        }
        UA0 ua02 = new UA0(this.A00, vk7);
        arrayList.add(ua02);
        return ua02;
    }

    @Override // X.XDW
    public final boolean Cuf(MenuItem menuItem, VK7 vk7) {
        return this.A01.onActionItemClicked(A00(vk7), new UDH(this.A00, (C02K) menuItem));
    }

    @Override // X.XDW
    public final boolean D83(Menu menu, VK7 vk7) {
        ActionMode.Callback callback = this.A01;
        UA0 A00 = A00(vk7);
        C005001p c005001p = this.A02;
        Menu menu2 = (Menu) c005001p.get(menu);
        if (menu2 == null) {
            menu2 = new UDG(this.A00, (C02J) menu);
            c005001p.put(menu, menu2);
        }
        return callback.onCreateActionMode(A00, menu2);
    }

    @Override // X.XDW
    public final void D9v(VK7 vk7) {
        this.A01.onDestroyActionMode(A00(vk7));
    }

    @Override // X.XDW
    public final boolean DaH(Menu menu, VK7 vk7) {
        ActionMode.Callback callback = this.A01;
        UA0 A00 = A00(vk7);
        C005001p c005001p = this.A02;
        Menu menu2 = (Menu) c005001p.get(menu);
        if (menu2 == null) {
            menu2 = new UDG(this.A00, (C02J) menu);
            c005001p.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A00, menu2);
    }

    public WPK(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }
}
