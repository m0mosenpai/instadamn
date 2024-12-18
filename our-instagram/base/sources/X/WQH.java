package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes11.dex */
public class WQH implements C02J {
    public static final int[] A0O = {1, 4, 5, 3, 2, 0};
    public Drawable A01;
    public View A02;
    public InterfaceC52052a5 A03;
    public WQJ A04;
    public CharSequence A05;
    public ArrayList A06;
    public ArrayList A07;
    public ArrayList A08;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0E;
    public ArrayList A0G;
    public boolean A0K;
    public final Context A0M;
    public final Resources A0N;
    public int A00 = 0;
    public boolean A0D = false;
    public boolean A0J = false;
    public boolean A0L = false;
    public boolean A0I = false;
    public ArrayList A0F = new ArrayList();
    public CopyOnWriteArrayList A09 = new CopyOnWriteArrayList();
    public boolean A0H = false;

    public final void A05() {
        this.A0D = false;
        if (this.A0J) {
            this.A0J = false;
            A0D(this.A0L);
        }
    }

    public final void A08(Bundle bundle) {
        String str;
        MenuItem findItem;
        int itemId;
        if (this instanceof UDI) {
            WQJ wqj = ((UDI) this).A01;
            if (wqj != null && (itemId = wqj.getItemId()) != 0) {
                str = AnonymousClass001.A0b("android:menu:actionviewstates", ":", itemId);
            } else {
                str = null;
            }
        } else {
            str = "android:menu:actionviewstates";
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(str);
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((WQH) item.getSubMenu()).A08(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public final void clearHeader() {
        this.A01 = null;
        this.A05 = null;
        this.A02 = null;
        A0D(false);
    }

    @Override // android.view.Menu
    public final void close() {
        A0C(true);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = this.A07;
            if (((WQJ) arrayList.get(i2)).getGroupId() == i) {
                if (i2 >= 0) {
                    int size2 = arrayList.size() - i2;
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        if (i3 >= size2 || ((WQJ) arrayList.get(i2)).getGroupId() != i) {
                            break;
                        }
                        if (i2 < arrayList.size()) {
                            arrayList.remove(i2);
                        }
                        i3 = i4;
                    }
                    A0D(true);
                    return;
                }
                return;
            }
        }
    }

    public final WQH A00() {
        if (this instanceof UDI) {
            return ((UDI) this).A00.A00();
        }
        return this;
    }

    public final WQJ A01(KeyEvent keyEvent, int i) {
        char numericShortcut;
        ArrayList arrayList = this.A0F;
        arrayList.clear();
        A0A(keyEvent, arrayList, i);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (WQJ) arrayList.get(0);
        }
        boolean A0F = A0F();
        for (int i2 = 0; i2 < size; i2++) {
            WQJ wqj = (WQJ) arrayList.get(i2);
            if (A0F) {
                numericShortcut = wqj.getAlphabeticShortcut();
            } else {
                numericShortcut = wqj.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (A0F && numericShortcut == '\b' && i == 67))) {
                return wqj;
            }
        }
        return null;
    }

    public final WQJ A02(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = A0O;
            if (i5 < 6) {
                int i6 = (i3 & 65535) | (iArr[i5] << 16);
                WQJ wqj = new WQJ(this, charSequence, i, i2, i3, i6, this.A00);
                ArrayList arrayList = this.A07;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (((WQJ) arrayList.get(size)).A0P <= i6) {
                            i4 = size + 1;
                            break;
                        }
                    } else {
                        i4 = 0;
                        break;
                    }
                }
                arrayList.add(i4, wqj);
                A0D(true);
                return wqj;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final ArrayList A03() {
        if (this.A0B) {
            ArrayList arrayList = this.A0G;
            arrayList.clear();
            ArrayList arrayList2 = this.A07;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                WQJ wqj = (WQJ) arrayList2.get(i);
                if (wqj.isVisible()) {
                    arrayList.add(wqj);
                }
            }
            this.A0B = false;
            this.A0A = true;
        }
        return this.A0G;
    }

    public final void A06() {
        if (!this.A0D) {
            this.A0D = true;
            this.A0J = false;
            this.A0L = false;
        }
    }

    public final void A07(Context context, XEV xev) {
        this.A09.add(new WeakReference(xev));
        xev.CNw(context, this);
        this.A0A = true;
    }

    public final void A0A(KeyEvent keyEvent, List list, int i) {
        char numericShortcut;
        int numericModifiers;
        boolean A0F = A0F();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WQJ wqj = (WQJ) arrayList.get(i2);
            if (wqj.hasSubMenu()) {
                ((WQH) wqj.getSubMenu()).A0A(keyEvent, list, i);
            }
            if (A0F) {
                numericShortcut = wqj.getAlphabeticShortcut();
                numericModifiers = wqj.getAlphabeticModifiers();
            } else {
                numericShortcut = wqj.getNumericShortcut();
                numericModifiers = wqj.getNumericModifiers();
            }
            if ((modifiers & 69647) == (numericModifiers & 69647) && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (A0F && numericShortcut == '\b' && i == 67)) && wqj.isEnabled()) {
                    list.add(wqj);
                }
            }
        }
    }

    public final void A0B(XEV xev) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            Object obj = reference.get();
            if (obj == null || obj == xev) {
                copyOnWriteArrayList.remove(reference);
            }
        }
    }

    public final void A0C(boolean z) {
        if (!this.A0I) {
            this.A0I = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                XEV xev = (XEV) reference.get();
                if (xev == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    xev.D5e(this, z);
                }
            }
            this.A0I = false;
        }
    }

    public final void A0D(boolean z) {
        if (!this.A0D) {
            if (z) {
                this.A0B = true;
                this.A0A = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            if (!copyOnWriteArrayList.isEmpty()) {
                A06();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    XEV xev = (XEV) reference.get();
                    if (xev == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        xev.FBO(z);
                    }
                }
                A05();
                return;
            }
            return;
        }
        this.A0J = true;
        if (z) {
            this.A0L = true;
        }
    }

    public final boolean A0E() {
        if (this instanceof UDI) {
            return ((UDI) this).A00.A0E();
        }
        return this.A0H;
    }

    public final boolean A0F() {
        if (this instanceof UDI) {
            return ((UDI) this).A00.A0F();
        }
        return this.A0K;
    }

    public final boolean A0G() {
        if (this instanceof UDI) {
            return ((UDI) this).A00.A0G();
        }
        return this.A0E;
    }

    public boolean A0H(MenuItem menuItem, WQH wqh) {
        InterfaceC52052a5 interfaceC52052a5 = this.A03;
        if (interfaceC52052a5 != null && interfaceC52052a5.DSo(menuItem, wqh)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (((X.UER) r4).A01.hasSubMenu() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r7 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        A0C(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if ((r11 & 1) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a9, code lost:
    
        if (r7 == false) goto L19;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.WQH, X.UDI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0I(android.view.MenuItem r9, X.XEV r10, int r11) {
        /*
            r8 = this;
            X.WQJ r9 = (X.WQJ) r9
            r3 = 0
            if (r9 == 0) goto Lda
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto Lda
            android.view.MenuItem$OnMenuItemClickListener r0 = r9.A09
            r7 = 1
            if (r0 == 0) goto Lac
            boolean r0 = r0.onMenuItemClick(r9)
            if (r0 == 0) goto Lac
        L16:
            X.02Y r4 = r9.A0C
            r6 = 1
            if (r4 == 0) goto L27
            r0 = r4
            X.UER r0 = (X.UER) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.hasSubMenu()
            r2 = 1
            if (r0 != 0) goto L28
        L27:
            r2 = 0
        L28:
            boolean r0 = r9.A02()
            if (r0 == 0) goto L39
            boolean r0 = r9.expandActionView()
            r7 = r7 | r0
            if (r7 == 0) goto L38
        L35:
            r8.A0C(r6)
        L38:
            return r7
        L39:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L46
            if (r2 != 0) goto L46
            r0 = r11 & 1
            if (r0 != 0) goto L38
            goto L35
        L46:
            r0 = r11 & 4
            if (r0 != 0) goto L4d
            r8.A0C(r3)
        L4d:
            boolean r0 = r9.hasSubMenu()
            if (r0 != 0) goto L67
            android.content.Context r0 = r8.A0M
            X.UDI r1 = new X.UDI
            r1.<init>(r0)
            r1.A00 = r8
            r1.A01 = r9
            r9.A0B = r1
            java.lang.CharSequence r0 = r9.getTitle()
            r1.setHeaderTitle(r0)
        L67:
            android.view.SubMenu r5 = r9.getSubMenu()
            X.UDI r5 = (X.UDI) r5
            if (r2 == 0) goto L76
            X.UER r4 = (X.UER) r4
            android.view.ActionProvider r0 = r4.A01
            r0.onPrepareSubMenu(r5)
        L76:
            java.util.concurrent.CopyOnWriteArrayList r4 = r8.A09
            boolean r1 = r4.isEmpty()
            r0 = 0
            if (r1 != 0) goto La8
            if (r10 == 0) goto L85
            boolean r0 = r10.DpV(r5)
        L85:
            java.util.Iterator r3 = r4.iterator()
        L89:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r2 = r3.next()
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2
            java.lang.Object r1 = r2.get()
            X.XEV r1 = (X.XEV) r1
            if (r1 != 0) goto La1
            r4.remove(r2)
            goto L89
        La1:
            if (r0 != 0) goto L89
            boolean r0 = r1.DpV(r5)
            goto L89
        La8:
            r7 = r7 | r0
            if (r7 != 0) goto L38
            goto L35
        Lac:
            X.WQH r2 = r9.A0A
            boolean r0 = r2.A0H(r9, r2)
            if (r0 != 0) goto L16
            android.content.Intent r1 = r9.A06
            if (r1 == 0) goto Lc7
            android.content.Context r0 = r2.A0M     // Catch: android.content.ActivityNotFoundException -> Lbf
            r0.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> Lbf
            goto L16
        Lbf:
            r2 = move-exception
            java.lang.String r1 = "MenuItemImpl"
            java.lang.String r0 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r1, r0, r2)
        Lc7:
            X.02Y r0 = r9.A0C
            if (r0 == 0) goto Ld7
            X.UER r0 = (X.UER) r0
            android.view.ActionProvider r0 = r0.A01
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto Ld7
            goto L16
        Ld7:
            r7 = 0
            goto L16
        Lda:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WQH.A0I(android.view.MenuItem, X.XEV, int):boolean");
    }

    public final boolean A0J(WQJ wqj) {
        if (this instanceof UDI) {
            return ((UDI) this).A00.A0J(wqj);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty() || this.A04 != wqj) {
            return false;
        }
        A06();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            XEV xev = (XEV) reference.get();
            if (xev == null) {
                copyOnWriteArrayList.remove(reference);
            } else {
                z = xev.AIM(this, wqj);
                if (z) {
                    break;
                }
            }
        }
        A05();
        if (!z) {
            return z;
        }
        this.A04 = null;
        return z;
    }

    public final boolean A0K(WQJ wqj) {
        if (this instanceof UDI) {
            return ((UDI) this).A00.A0K(wqj);
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        A06();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            XEV xev = (XEV) reference.get();
            if (xev == null) {
                copyOnWriteArrayList.remove(reference);
            } else {
                z = xev.ATp(this, wqj);
                if (z) {
                    break;
                }
            }
        }
        A05();
        if (!z) {
            return z;
        }
        this.A04 = wqj;
        return z;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return A02(this.A0N.getString(i), 0, 0, 0);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        PackageManager packageManager = this.A0M.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < i5; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(((PackageItemInfo) ((ComponentInfo) activityInfo).applicationInfo).packageName, ((PackageItemInfo) activityInfo).name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.A0N.getString(i));
    }

    @Override // android.view.Menu
    public final void clear() {
        WQJ wqj = this.A04;
        if (wqj != null) {
            A0J(wqj);
        }
        this.A07.clear();
        A0D(true);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.A07.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (!this.A0C) {
            int size = size();
            for (int i = 0; i < size; i++) {
                if (!((WQJ) this.A07.get(i)).isVisible()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WQJ wqj = (WQJ) arrayList.get(i2);
            if (wqj.getGroupId() == i) {
                int i3 = wqj.A02 & (-5);
                int i4 = 0;
                if (z2) {
                    i4 = 4;
                }
                wqj.A02 = i4 | i3;
                wqj.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        if (this instanceof UDI) {
            ((UDI) this).A00.setGroupDividerEnabled(z);
        } else {
            this.A0H = z;
        }
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WQJ wqj = (WQJ) arrayList.get(i2);
            if (wqj.getGroupId() == i) {
                wqj.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.A07;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            WQJ wqj = (WQJ) arrayList.get(i2);
            if (wqj.getGroupId() == i) {
                int i3 = wqj.A02;
                int A05 = AbstractC167007dF.A05(z ? 1 : 0) | (i3 & (-9));
                wqj.A02 = A05;
                if (i3 != A05) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            A0D(true);
        }
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        if (this instanceof UDI) {
            ((UDI) this).A00.setQwertyMode(z);
        } else {
            this.A0K = z;
            A0D(false);
        }
    }

    @Override // android.view.Menu
    public final int size() {
        return this.A07.size();
    }

    public WQH(Context context) {
        this.A0M = context;
        Resources resources = context.getResources();
        this.A0N = resources;
        this.A07 = new ArrayList();
        this.A0G = new ArrayList();
        this.A0B = true;
        this.A06 = new ArrayList();
        this.A08 = new ArrayList();
        this.A0A = true;
        this.A0E = resources.getConfiguration().keyboard != 1 && ViewConfiguration.get(this.A0M).shouldShowMenuShortcutsWhenKeyboardPresent();
    }

    public final void A04() {
        ArrayList A03 = A03();
        if (this.A0A) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.A09;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                XEV xev = (XEV) reference.get();
                if (xev == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    z |= xev.AVx();
                }
            }
            if (z) {
                ArrayList arrayList = this.A06;
                arrayList.clear();
                ArrayList arrayList2 = this.A08;
                arrayList2.clear();
                int size = A03.size();
                for (int i = 0; i < size; i++) {
                    WQJ wqj = (WQJ) A03.get(i);
                    ArrayList arrayList3 = arrayList2;
                    if ((wqj.A02 & 32) == 32) {
                        arrayList3 = arrayList;
                    }
                    arrayList3.add(wqj);
                }
            } else {
                this.A06.clear();
                ArrayList arrayList4 = this.A08;
                arrayList4.clear();
                arrayList4.addAll(A03());
            }
            this.A0A = false;
        }
    }

    public final void A09(Bundle bundle) {
        String str;
        int itemId;
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((WQH) item.getSubMenu()).A09(bundle);
            }
        }
        if (sparseArray != null) {
            if (this instanceof UDI) {
                WQJ wqj = ((UDI) this).A01;
                if (wqj != null && (itemId = wqj.getItemId()) != 0) {
                    str = AnonymousClass001.A0b("android:menu:actionviewstates", ":", itemId);
                } else {
                    str = null;
                }
            } else {
                str = "android:menu:actionviewstates";
            }
            bundle.putSparseParcelableArray(str, sparseArray);
        }
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem menuItem = (WQJ) this.A07.get(i2);
            if (menuItem.getItemId() == i || (menuItem.hasSubMenu() && (menuItem = menuItem.getSubMenu().findItem(i)) != null)) {
                return menuItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return AbstractC167007dF.A1W(A01(keyEvent, i));
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return A0I(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        WQJ A01 = A01(keyEvent, i);
        if (A01 != null) {
            z = A0I(A01, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            A0C(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList = this.A07;
            if (((WQJ) arrayList.get(i2)).getItemId() == i) {
                if (i2 >= 0 && i2 < arrayList.size()) {
                    arrayList.remove(i2);
                    A0D(true);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return A02(this.A0N.getString(i4), i, i2, i3);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.WQH, X.UDI, android.view.SubMenu] */
    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        WQJ A02 = A02(charSequence, i, i2, i3);
        ?? wqh = new WQH(this.A0M);
        wqh.A00 = this;
        wqh.A01 = A02;
        A02.A0B = wqh;
        wqh.setHeaderTitle(A02.getTitle());
        return wqh;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return A02(charSequence, 0, 0, 0);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A02(charSequence, i, i2, i3);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.A0N.getString(i4));
    }
}
