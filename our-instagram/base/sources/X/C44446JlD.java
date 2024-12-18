package X;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.JlD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44446JlD extends AbstractC10330gz {
    public int A00;
    public final SparseArray A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;
    public final FragmentActivity A04;
    public final C1825187q A05;

    @Override // X.AbstractC021208i
    public final int getItemPosition(Object obj) {
        EnumC44072Jdx enumC44072Jdx;
        C14360o3.A0B(obj, 0);
        if (obj.equals(K9J.A01)) {
            enumC44072Jdx = EnumC44072Jdx.A04;
        } else if (obj.equals(K9K.A03)) {
            enumC44072Jdx = EnumC44072Jdx.A02;
        } else {
            if (!(obj instanceof MSL)) {
                return -2;
            }
            enumC44072Jdx = EnumC44072Jdx.A03;
        }
        InterfaceC09390do interfaceC09390do = this.A03;
        if (!AbstractC31171DnF.A0n(interfaceC09390do).contains(enumC44072Jdx)) {
            return -2;
        }
        return AbstractC31171DnF.A0n(interfaceC09390do).indexOf(enumC44072Jdx);
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Object instantiateItem = super.instantiateItem(viewGroup, i);
        C14360o3.A0C(instantiateItem, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
        this.A01.put(i, instantiateItem);
        return instantiateItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.KCW, X.MOq, java.lang.Object] */
    @Override // X.AbstractC10330gz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment A00(int r13) {
        /*
            r12 = this;
            X.0do r0 = r12.A03
            java.util.List r0 = X.AbstractC31171DnF.A0n(r0)
            java.lang.Object r0 = X.AbstractC001800i.A0O(r0, r13)
            X.Jdx r0 = (X.EnumC44072Jdx) r0
            if (r0 == 0) goto L76
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L70
            r0 = 0
            if (r1 == r0) goto L76
            r11 = 1
            if (r1 != r11) goto L76
            androidx.fragment.app.FragmentActivity r3 = r12.A04
            com.instagram.common.session.UserSession r1 = r12.A02
            X.87q r0 = r12.A05
            X.L2J r2 = new X.L2J
            r2.<init>(r3, r0, r1)
            com.instagram.common.session.UserSession r6 = r2.A02
            X.Lhm r7 = new X.Lhm
            r7.<init>(r2)
            X.KcO r8 = X.EnumC46186KcO.A0F
            X.0sl r10 = X.C16930sl.A00
            java.lang.String r9 = ""
            r5 = 0
            r0 = 23
            X.C14360o3.A0B(r10, r0)
            X.KCW r4 = X.AbstractC47845LBn.A01(r6, r7, r8, r9, r10, r11)
            X.989 r1 = X.AnonymousClass988.A1Z
            android.os.Parcelable$Creator r0 = com.instagram.direct.capabilities.Capabilities.CREATOR
            com.instagram.direct.capabilities.Capabilities r0 = X.AbstractC2054797v.A00(r10)
            X.988 r3 = r1.A00(r6, r0)
            androidx.fragment.app.FragmentActivity r2 = r2.A00
            java.lang.Integer r1 = X.C05F.A0N
            X.7ID r0 = X.C7ID.A00
            X.7IM r0 = r0.A01(r2, r3, r5, r1)
            X.7IK r0 = r0.A07
            r4.ADq(r0)
            X.C14360o3.A0A(r4)
        L5b:
            android.os.Bundle r0 = r4.mArguments
            if (r0 != 0) goto L66
            android.os.Bundle r0 = X.AbstractC166987dD.A0b()
            r4.setArguments(r0)
        L66:
            android.os.Bundle r1 = r4.mArguments
            if (r1 == 0) goto L6f
            com.instagram.common.session.UserSession r0 = r12.A02
            X.AbstractC31173DnH.A1C(r1, r0)
        L6f:
            return r4
        L70:
            X.K9J r4 = new X.K9J
            r4.<init>()
            goto L5b
        L76:
            X.K9K r4 = new X.K9K
            r4.<init>()
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44446JlD.A00(int):androidx.fragment.app.Fragment");
    }

    @Override // X.AbstractC021208i
    public final int getCount() {
        return AbstractC31171DnF.A0n(this.A03).size();
    }

    @Override // X.AbstractC021208i
    public final CharSequence getPageTitle(int i) {
        int ordinal;
        Resources resources;
        int i2;
        EnumC44072Jdx enumC44072Jdx = (EnumC44072Jdx) AbstractC001800i.A0O(AbstractC31171DnF.A0n(this.A03), i);
        if (enumC44072Jdx == null) {
            ordinal = -1;
        } else {
            ordinal = enumC44072Jdx.ordinal();
            if (ordinal == 2) {
                resources = this.A04.getResources();
                i2 = 2131963291;
                return AbstractC166997dE.A0q(resources, i2);
            }
        }
        if (ordinal != 0) {
            if (ordinal != 1) {
                return "";
            }
            resources = this.A04.getResources();
            i2 = 2131963290;
            return AbstractC166997dE.A0q(resources, i2);
        }
        if (C18U.A06(C06090Tz.A05, this.A02, 36327533469448864L)) {
            return "";
        }
        String string = this.A04.getResources().getString(2131963289);
        C14360o3.A0A(string);
        return string;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44446JlD(FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, C1825187q c1825187q, UserSession userSession) {
        super(abstractC10360h2, 0);
        AbstractC43594JPz.A1P(userSession, c1825187q);
        this.A02 = userSession;
        this.A04 = fragmentActivity;
        this.A05 = c1825187q;
        this.A01 = new SparseArray();
        this.A03 = AbstractC09440dt.A01(C50250MHf.A01(this, 42));
        this.A00 = -1;
    }

    @Override // X.AbstractC10330gz, X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC167017dG.A1O(viewGroup, obj);
        this.A01.remove(i);
        super.destroyItem(viewGroup, i, obj);
    }
}
