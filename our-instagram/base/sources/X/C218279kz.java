package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218279kz extends C8J9 implements C8FJ {
    public final C218179kp A00;
    public final InterfaceC185008Ip A01;
    public final boolean A02;
    public final C8J0 A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.8JE, X.9kp] */
    public C218279kz(Context context, C8J0 c8j0, InterfaceC185008Ip interfaceC185008Ip, C8C0 c8c0, boolean z) {
        super(c8c0);
        AbstractC167027dH.A0a(1, context, c8c0, interfaceC185008Ip, c8j0);
        this.A01 = interfaceC185008Ip;
        this.A03 = c8j0;
        this.A02 = z;
        ?? c8je = new C8JE(context, this, this, false, true, false, false);
        this.A00 = c8je;
        super.A00 = c8je;
    }

    public final void A02(EnumC185018Iq enumC185018Iq) {
        String str;
        C14360o3.A0B(enumC185018Iq, 0);
        C218179kp c218179kp = this.A00;
        List list = ((C8JF) c218179kp).A02;
        int size = Collections.unmodifiableList(list).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C23573AcR c23573AcR = (C23573AcR) Collections.unmodifiableList(list).get(i);
            String str2 = enumC185018Iq.A00;
            if (c23573AcR != null) {
                str = c23573AcR.A01;
            } else {
                str = null;
            }
            if (C14360o3.A0K(str2, str)) {
                if (i != -1) {
                    c218179kp.A03(i);
                    C11T.A03(new RunnableC24759Axh(this, i, false));
                    C8J0 c8j0 = this.A03;
                    C14360o3.A06(str2);
                    c8j0.A03.A0C(str2, c8j0.A00);
                    return;
                }
            } else {
                i++;
            }
        }
        C8J0 c8j02 = this.A03;
        c8j02.A03.A07("could not find selected mode", "", 518927814, c8j02.A00);
    }

    public final void A03(List list) {
        C218179kp c218179kp = this.A00;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(new C23573AcR((EnumC185018Iq) it.next()));
        }
        c218179kp.A05(A0q);
        list.size();
        C8C0 c8c0 = super.A01;
        AbstractC13880nE.A0u(c8c0.A0P, new CallableC24924B0x(this, 3));
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
        C23573AcR c23573AcR = (C23573AcR) interfaceC120325cX;
        C14360o3.A0B(c23573AcR, 0);
        if (!this.A02 || super.A01.A0P.getScrollState() == 0) {
            this.A01.DTi(c23573AcR.A00);
        }
    }

    @Override // X.C8J9
    public final void A01(List list) {
        EnumC185018Iq enumC185018Iq;
        super.A01(list);
        if (this.A02) {
            C218179kp c218179kp = this.A00;
            int i = ((C8JF) c218179kp).A00;
            if (c218179kp.A06(i)) {
                C23573AcR c23573AcR = (C23573AcR) c218179kp.A01(i);
                if (c23573AcR != null) {
                    enumC185018Iq = c23573AcR.A00;
                } else {
                    enumC185018Iq = null;
                }
                InterfaceC185008Ip interfaceC185008Ip = this.A01;
                EnumC185018Iq Aud = interfaceC185008Ip.Aud();
                if (enumC185018Iq != null && enumC185018Iq != Aud) {
                    interfaceC185008Ip.DTi(enumC185018Iq);
                }
            }
        }
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
        throw C00O.createAndThrow();
    }
}
