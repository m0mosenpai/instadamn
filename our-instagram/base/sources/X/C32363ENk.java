package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.google.common.collect.ImmutableList;

/* renamed from: X.ENk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32363ENk extends C53Z implements CallerContextable {
    public static final ImmutableList A02;
    public static final String __redex_internal_original_name = "ContactOptionsFragment";
    public InterfaceC151446rm A00;
    public final InterfaceC09390do A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "contact_sheet";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        r13.add(r1);
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            r14 = this;
            r9 = 0
            X.C14360o3.A0B(r15, r9)
            r10 = r14
            r0 = r16
            super.onViewCreated(r15, r0)
            r0 = 2131430669(0x7f0b0d0d, float:1.8483045E38)
            android.view.View r11 = X.AbstractC166997dE.A0R(r15, r0)
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            android.content.Context r0 = r14.getContext()
            r3 = 1
            X.AbstractC31174DnI.A16(r0, r11, r3, r9)
            android.os.Bundle r8 = r14.requireArguments()
            java.lang.String r0 = "ContactOptionsFragment.ACTION_ID_LIST"
            java.util.ArrayList r2 = r8.getIntegerArrayList(r0)
            java.lang.String r1 = "Missing Action Ids."
            if (r2 == 0) goto Le6
            boolean r0 = X.AbstractC25226BEj.A1b(r2)
            if (r0 == 0) goto Le1
            java.util.ArrayList r13 = X.AbstractC166987dD.A1E()
            boolean r0 = X.AbstractC25226BEj.A1b(r2)
            if (r0 == 0) goto L63
            java.util.Iterator r7 = r2.iterator()
        L3d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L63
            int r6 = X.AbstractC167007dF.A0B(r7)
            X.6rk[] r5 = X.EnumC151426rk.values()
            int r4 = r5.length
            r2 = 0
        L4d:
            if (r2 >= r4) goto L5c
            r1 = r5[r2]
            int r0 = r1.A00
            if (r0 != r6) goto L59
            r13.add(r1)
            goto L3d
        L59:
            int r2 = r2 + 1
            goto L4d
        L5c:
            java.lang.String r0 = "Invalid Button Id"
            java.lang.IllegalArgumentException r0 = X.AbstractC166987dD.A12(r0)
            throw r0
        L63:
            java.lang.String r0 = "ContactOptionsFragment.REQUEST_CONTACT_ENABLED"
            boolean r0 = r8.getBoolean(r0, r9)
            java.util.ArrayList r12 = X.AbstractC166987dD.A1E()
            if (r0 == 0) goto L8f
            com.google.common.collect.ImmutableList r0 = X.C32363ENk.A02
            X.1LC r2 = r0.iterator()
            X.C14360o3.A07(r2)
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()
            boolean r0 = r13.contains(r1)
            if (r0 != 0) goto L78
            X.C14360o3.A0A(r1)
            r12.add(r1)
            goto L78
        L8f:
            X.0do r2 = r14.A01
            java.lang.Object r0 = r2.getValue()
            X.DyZ r0 = (X.C31815DyZ) r0
            X.05A r0 = r0.A03
            X.191 r1 = X.AnonymousClass191.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.AbstractC58232lf.A00(r1, r0)
            X.Fr0 r8 = new X.Fr0
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A06(r14, r8)
            java.lang.Object r0 = r2.getValue()
            X.DyZ r0 = (X.C31815DyZ) r0
            X.05A r0 = r0.A04
            androidx.lifecycle.CoroutineLiveData r1 = X.AbstractC58232lf.A00(r1, r0)
            r0 = 36
            X.C31470DsE.A00(r14, r1, r0)
            java.lang.Object r5 = r2.getValue()
            X.DyZ r5 = (X.C31815DyZ) r5
            X.18A r0 = r5.A01
            java.lang.String r4 = r5.A02
            com.instagram.user.model.User r2 = r0.A02(r4)
            if (r2 != 0) goto Ld6
            X.4LM r3 = X.C4LM.A02
            com.instagram.common.session.UserSession r2 = r5.A00
            r1 = 3
            X.GIJ r0 = new X.GIJ
            r0.<init>(r5, r1)
            r3.A02(r2, r0, r4)
            return
        Ld6:
            X.05A r1 = r5.A03
            X.FJY r0 = new X.FJY
            r0.<init>(r2, r3)
            r1.Egh(r0)
            return
        Le1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        Le6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32363ENk.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    static {
        ImmutableList of = ImmutableList.of((Object) EnumC151426rk.CALL, (Object) EnumC151426rk.EMAIL);
        C14360o3.A07(of);
        A02 = of;
    }

    public C32363ENk() {
        GSw gSw = new GSw(this, 45);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSw(new GSw(this, 42), 43));
        this.A01 = AbstractC25225BEi.A0a(new GSw(A00, 44), gSw, new C57255Pbd(49, null, A00), AbstractC25225BEi.A1D(C31815DyZ.class));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C0f9.A02(575852606);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_contact_options_fragment, viewGroup, false);
        C0f9.A09(-1232582509, A022);
        return inflate;
    }
}
