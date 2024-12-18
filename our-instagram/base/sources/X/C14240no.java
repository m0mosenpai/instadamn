package X;

import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: X.0no, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14240no extends AbstractC016706m implements C06O, C06J {
    public int A00;
    public boolean A01;
    public final AbstractC10360h2 A02;

    @Override // X.AbstractC016706m
    public final int A00() {
        return A0J(false);
    }

    @Override // X.AbstractC016706m
    public final int A01() {
        return A0J(true);
    }

    @Override // X.C06O
    public final boolean AWw(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC10360h2.A0H(2);
        arrayList.add(this);
        arrayList2.add(false);
        if (this.A0E) {
            this.A02.A0E.add(this);
            return true;
        }
        return true;
    }

    @Override // X.AbstractC016706m
    public final AbstractC016706m A02(Fragment fragment) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 != null && abstractC10360h2 != this.A02) {
            throw new IllegalStateException(AnonymousClass001.A0g("Cannot detach Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.A02(fragment);
        return this;
    }

    @Override // X.AbstractC016706m
    public final AbstractC016706m A03(Fragment fragment) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 != null && abstractC10360h2 != this.A02) {
            throw new IllegalStateException(AnonymousClass001.A0g("Cannot remove Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.A03(fragment);
        return this;
    }

    @Override // X.AbstractC016706m
    public final AbstractC016706m A04(Fragment fragment, C07S c07s) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        AbstractC10360h2 abstractC10360h22 = this.A02;
        if (abstractC10360h2 == abstractC10360h22) {
            super.A04(fragment, c07s);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
        sb.append(abstractC10360h22);
        throw new IllegalArgumentException(sb.toString());
    }

    public final int A0J(boolean z) {
        int i;
        if (!this.A01) {
            if (AbstractC10360h2.A0H(2)) {
                PrintWriter printWriter = new PrintWriter(new C017906z());
                A0O(printWriter, "  ", true);
                printWriter.close();
            }
            this.A01 = true;
            if (this.A0E) {
                i = this.A02.A0a.getAndIncrement();
            } else {
                i = -1;
            }
            this.A00 = i;
            this.A02.A0s(this, z);
            return this.A00;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void A0L(int i) {
        if (this.A0E) {
            AbstractC10360h2.A0H(2);
            ArrayList arrayList = this.A0B;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = ((C06l) arrayList.get(i2)).A05;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    AbstractC10360h2.A0H(2);
                }
            }
        }
    }

    public final void A0M(Fragment fragment) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 != null && abstractC10360h2 != this.A02) {
            throw new IllegalStateException(AnonymousClass001.A0g("Cannot hide Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        A0F(new C06l(fragment, 4));
    }

    public final void A0N(Fragment fragment) {
        AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
        if (abstractC10360h2 != null && abstractC10360h2 != this.A02) {
            throw new IllegalStateException(AnonymousClass001.A0g("Cannot show Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        A0F(new C06l(fragment, 5));
    }

    public final void A0O(PrintWriter printWriter, String str, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.A09);
            printWriter.print(" mIndex=");
            printWriter.print(this.A00);
            printWriter.print(" mCommitted=");
            printWriter.println(this.A01);
            if (this.A06 != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.A06));
            }
            if (super.A02 != 0 || this.A03 != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(super.A02));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.A03));
            }
            if (this.A04 != 0 || this.A05 != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.A04));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.A05));
            }
            if (super.A01 != 0 || this.A08 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(super.A01));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.A08);
            }
            if (super.A00 != 0 || this.A07 != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(super.A00));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.A07);
            }
        }
        ArrayList arrayList = this.A0B;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C06l c06l = (C06l) arrayList.get(i);
                int i2 = c06l.A00;
                switch (i2) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = AnonymousClass001.A0O("cmd=", i2);
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c06l.A05);
                if (z) {
                    if (c06l.A01 != 0 || c06l.A02 != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c06l.A01));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c06l.A02));
                    }
                    if (c06l.A03 != 0 || c06l.A04 != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c06l.A03));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c06l.A04));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        int i = this.A00;
        if (i >= 0) {
            sb.append(" #");
            sb.append(i);
        }
        String str = this.A09;
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14240no(X.AbstractC10360h2 r3) {
        /*
            r2 = this;
            X.06B r1 = r3.A0R()
            X.0i8 r0 = r3.A0A
            if (r0 == 0) goto L17
            android.content.Context r0 = r0.A01
            java.lang.ClassLoader r0 = r0.getClassLoader()
        Le:
            r2.<init>(r1, r0)
            r0 = -1
            r2.A00 = r0
            r2.A02 = r3
            return
        L17:
            r0 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14240no.<init>(X.0h2):void");
    }

    @Override // X.AbstractC016706m
    public final void A06() {
        A05();
        this.A02.A0t(this, true);
    }

    @Override // X.AbstractC016706m
    public final void A0E(Fragment fragment, String str, int i, int i2) {
        super.A0E(fragment, str, i, i2);
        fragment.mFragmentManager = this.A02;
    }

    public final void A0K() {
        A05();
        this.A02.A0t(this, false);
    }
}
