package X;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.BYk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25725BYk extends ActionMode.Callback2 {
    public final C5Di A00;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        InterfaceC16820sZ interfaceC16820sZ;
        C5Di c5Di = this.A00;
        C14360o3.A0A(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            interfaceC16820sZ = c5Di.A01;
        } else if (itemId == 1) {
            interfaceC16820sZ = c5Di.A03;
        } else if (itemId == 2) {
            interfaceC16820sZ = c5Di.A02;
        } else if (itemId == 3) {
            interfaceC16820sZ = c5Di.A04;
        } else {
            return false;
        }
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C5Di c5Di = this.A00;
        if (menu != null) {
            if (actionMode != null) {
                if (c5Di.A01 != null) {
                    C5Di.A00(menu, C05F.A00);
                }
                if (c5Di.A03 != null) {
                    C5Di.A00(menu, C05F.A01);
                }
                if (c5Di.A02 != null) {
                    C5Di.A00(menu, C05F.A0C);
                }
                if (c5Di.A04 != null) {
                    C5Di.A00(menu, C05F.A0N);
                    return true;
                }
                return true;
            }
            throw AbstractC166987dD.A12("onCreateActionMode requires a non-null mode");
        }
        throw AbstractC166987dD.A12("onCreateActionMode requires a non-null menu");
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        InterfaceC16820sZ interfaceC16820sZ = this.A00.A05;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C114205Dh c114205Dh = this.A00.A00;
        if (rect != null) {
            rect.set((int) c114205Dh.A01, (int) c114205Dh.A03, (int) c114205Dh.A02, (int) c114205Dh.A00);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C5Di c5Di = this.A00;
        if (actionMode != null && menu != null) {
            Integer num = C05F.A00;
            if (c5Di.A01 != null) {
                if (menu.findItem(0) == null) {
                    C5Di.A00(menu, num);
                }
            } else if (menu.findItem(0) != null) {
                menu.removeItem(0);
            }
            Integer num2 = C05F.A01;
            if (c5Di.A03 != null) {
                if (menu.findItem(1) == null) {
                    C5Di.A00(menu, num2);
                }
            } else if (menu.findItem(1) != null) {
                menu.removeItem(1);
            }
            Integer num3 = C05F.A0C;
            if (c5Di.A02 != null) {
                if (menu.findItem(2) == null) {
                    C5Di.A00(menu, num3);
                }
            } else if (menu.findItem(2) != null) {
                menu.removeItem(2);
            }
            Integer num4 = C05F.A0N;
            if (c5Di.A04 != null) {
                if (menu.findItem(3) == null) {
                    C5Di.A00(menu, num4);
                    return true;
                }
                return true;
            }
            if (menu.findItem(3) == null) {
                return true;
            }
            menu.removeItem(3);
            return true;
        }
        return false;
    }

    public C25725BYk(C5Di c5Di) {
        this.A00 = c5Di;
    }
}
