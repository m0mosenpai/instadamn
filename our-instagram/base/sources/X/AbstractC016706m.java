package X;

import androidx.fragment.app.Fragment;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: X.06m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC016706m {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public CharSequence A07;
    public CharSequence A08;
    public String A09;
    public ArrayList A0A;
    public ArrayList A0C;
    public ArrayList A0D;
    public boolean A0E;
    public final C06B A0H;
    public final ClassLoader A0I;
    public ArrayList A0B = new ArrayList();
    public boolean A0F = true;
    public boolean A0G = false;

    public abstract int A00();

    public abstract int A01();

    public AbstractC016706m A02(Fragment fragment) {
        A0F(new C06l(fragment, 6));
        return this;
    }

    public AbstractC016706m A03(Fragment fragment) {
        A0F(new C06l(fragment, 3));
        return this;
    }

    public abstract void A06();

    public final void A08(Fragment fragment) {
        A0F(new C06l(fragment, 7));
    }

    public final void A09(Fragment fragment, int i) {
        A0E(fragment, null, i, 1);
    }

    public final void A0A(Fragment fragment, int i) {
        A0D(fragment, null, i);
    }

    public final void A0B(Fragment fragment, String str) {
        A0E(fragment, str, 0, 1);
    }

    public final void A0C(Fragment fragment, String str, int i) {
        A0E(fragment, str, i, 1);
    }

    public final void A0G(Class cls, int i) {
        C06B c06b = this.A0H;
        if (c06b != null) {
            ClassLoader classLoader = this.A0I;
            if (classLoader != null) {
                A0D(c06b.A01(classLoader, cls.getName()), null, i);
                return;
            }
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.06l] */
    public AbstractC016706m A04(Fragment fragment, C07S c07s) {
        ?? obj = new Object();
        obj.A00 = 10;
        obj.A05 = fragment;
        obj.A08 = false;
        obj.A07 = fragment.mMaxState;
        obj.A06 = c07s;
        A0F(obj);
        return this;
    }

    public final void A05() {
        if (!this.A0E) {
            this.A0F = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void A07(int i, int i2, int i3, int i4) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A05 = i4;
    }

    public final void A0D(Fragment fragment, String str, int i) {
        if (i != 0) {
            A0E(fragment, str, i, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public void A0E(Fragment fragment, String str, int i, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C07K.A03(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.mTag;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Can't change tag of fragment ");
                    sb.append(fragment);
                    sb.append(": was ");
                    sb.append(fragment.mTag);
                    sb.append(" now ");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Can't change container ID of fragment ");
                        sb2.append(fragment);
                        sb2.append(": was ");
                        sb2.append(fragment.mFragmentId);
                        sb2.append(" now ");
                        sb2.append(i);
                        throw new IllegalStateException(sb2.toString());
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't add fragment ");
                    sb3.append(fragment);
                    sb3.append(" with tag ");
                    sb3.append(str);
                    sb3.append(" to container view with no id");
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            A0F(new C06l(fragment, i2));
            return;
        }
        throw new IllegalStateException(AnonymousClass001.A0g("Fragment ", cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state."));
    }

    public final void A0F(C06l c06l) {
        this.A0B.add(c06l);
        c06l.A01 = this.A02;
        c06l.A02 = this.A03;
        c06l.A03 = this.A04;
        c06l.A04 = this.A05;
    }

    public final void A0I(String str) {
        if (this.A0F) {
            this.A0E = true;
            this.A09 = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public AbstractC016706m(C06B c06b, ClassLoader classLoader) {
        this.A0H = c06b;
        this.A0I = classLoader;
    }

    public final void A0H(Runnable runnable) {
        A05();
        ArrayList arrayList = this.A0A;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0A = arrayList;
        }
        arrayList.add(runnable);
    }
}
