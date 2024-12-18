package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7GD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7GD implements ActionMode.Callback {
    public final List A02 = new ArrayList();
    public Map A00 = AbstractC06930Yk.A0E();
    public final List A01 = new ArrayList();

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C14360o3.A0B(actionMode, 0);
        C14360o3.A0B(menuItem, 1);
        L00 l00 = (L00) this.A00.get(menuItem);
        if (l00 != null) {
            return ((Boolean) l00.A01.invoke(actionMode)).booleanValue();
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C14360o3.A0B(actionMode, 0);
        C14360o3.A0B(menu, 1);
        List list = this.A02;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.A01.contains(obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((AnonymousClass761) it.next()).D7x(actionMode), arrayList2);
        }
        int A0L = AbstractC16850sd.A0L(AbstractC06950Ym.A1E(arrayList2, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (Object obj2 : arrayList2) {
            MenuItem add = menu.add(((L00) obj2).A00);
            C14360o3.A07(add);
            linkedHashMap.put(add, obj2);
        }
        this.A00 = linkedHashMap;
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.A00 = AbstractC06930Yk.A0E();
    }
}
