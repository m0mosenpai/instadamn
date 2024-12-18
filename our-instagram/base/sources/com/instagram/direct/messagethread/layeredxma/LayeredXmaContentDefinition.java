package com.instagram.direct.messagethread.layeredxma;

import X.AbstractC16960so;
import X.AnonymousClass988;
import X.C14360o3;
import X.C1580177l;
import X.C158657Ab;
import X.C162897Ra;
import X.C162907Rb;
import X.C49168Lol;
import X.C7AZ;
import X.C7Q6;
import X.C7Q9;
import X.C7QC;
import X.C7QD;
import X.InterfaceC11380iw;
import X.InterfaceC165207a9;
import X.InterfaceC165247aD;
import X.InterfaceC165307aJ;
import X.InterfaceC165507ad;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public final class LayeredXmaContentDefinition implements C7QC {
    public final InterfaceC11380iw A00;
    public final C162907Rb A01;
    public final boolean A02;
    public final UserSession A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_layered_xma_message, viewGroup, false);
        C14360o3.A0A(inflate);
        C49168Lol c49168Lol = new C49168Lol(inflate);
        this.A01.A00(c49168Lol);
        return c49168Lol;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (r1.intValue() <= 0) goto L26;
     */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r14, X.InterfaceC129555tK r15) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.layeredxma.LayeredXmaContentDefinition.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49168Lol c49168Lol = (C49168Lol) c7qd;
        C14360o3.A0B(c49168Lol, 0);
        c49168Lol.A07.A04();
        this.A01.A01(c49168Lol);
    }

    public LayeredXmaContentDefinition(InterfaceC11380iw interfaceC11380iw, UserSession userSession, final InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, boolean z) {
        boolean z2 = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z2);
        C7Q6 c7q6 = new C7Q6() { // from class: X.7Sv
            /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
            
                if (r4.length() == 0) goto L50;
             */
            /* JADX WARN: Code restructure failed: missing block: B:47:0x013c, code lost:
            
                if (r3 == null) goto L66;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x013e, code lost:
            
                r3 = "xma_open_native";
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x0140, code lost:
            
                if (r0 != null) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0142, code lost:
            
                r0 = r13;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
            
                r8.CKa(X.AbstractC13880nE.A0G(r10.A07), X.C2EY.A0z, r7, null, 0, r2, r3, r0, r15, r14, r0, null, r0, null, null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0168, code lost:
            
                return true;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
            
                if (r5 != null) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x00ac, code lost:
            
                if (r1 != null) goto L19;
             */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x016e  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x009c  */
            @Override // X.C7Q6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ boolean DT4(android.view.MotionEvent r39, java.lang.Object r40, java.lang.Object r41) {
                /*
                    Method dump skipped, instructions count: 484
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C163327Sv.DT4(android.view.MotionEvent, java.lang.Object, java.lang.Object):boolean");
            }
        };
        C158657Ab c158657Ab = new C158657Ab(interfaceC165247aD, c7az.A00);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC165247aD, z2);
        this.A01 = new C162907Rb(AbstractC16960so.A1Q(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), c7q6, c158657Ab, c7q9, (InterfaceC165507ad) interfaceC165247aD, anonymousClass988, null, false), c7az));
        this.A00 = interfaceC11380iw;
        this.A03 = userSession;
        this.A02 = z;
    }
}
