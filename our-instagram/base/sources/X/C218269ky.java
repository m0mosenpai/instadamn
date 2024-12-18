package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218269ky extends C8J9 implements C8FJ {
    public final C194918js A00;
    public final C218219kt A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.8JE, X.9kt] */
    public C218269ky(Context context, UserSession userSession, C8C0 c8c0, C194918js c194918js) {
        super(c8c0);
        AbstractC167007dF.A1F(context, 1, userSession);
        this.A00 = c194918js;
        ?? r0 = new C8JE(context, userSession, this, this) { // from class: X.9kt
            public final List A00;
            public final boolean A01;

            {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                InterfaceC16530ry interfaceC16530ry = A00.A6b;
                C0YR[] c0yrArr = C23031Ai.A8c;
                boolean A1Q = AbstractC167007dF.A1Q(AbstractC166987dD.A0H(interfaceC16530ry.CES(A00, c0yrArr[59])), 3);
                this.A01 = A1Q;
                this.A00 = AbstractC190898cl.A07();
                if (A1Q) {
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    AbstractC167027dH.A16(A002, A002.A6b, c0yrArr, 59);
                }
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
            
                if (r11.A00.contains(r4) == false) goto L23;
             */
            @Override // X.C2UU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r12, int r13) {
                /*
                    Method dump skipped, instructions count: 366
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C218219kt.onBindViewHolder(X.3OO, int):void");
            }
        };
        this.A01 = r0;
        super.A00 = r0;
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DDC(InterfaceC120325cX interfaceC120325cX, String str, int i, boolean z) {
        C14360o3.A0B(interfaceC120325cX, 0);
        C194918js.A04(this.A00, i, false);
    }

    @Override // X.C8J9
    public final void A01(List list) {
        super.A01(list);
        C218219kt c218219kt = this.A01;
        int i = ((C8JF) c218219kt).A00;
        if (c218219kt.A06(i) && c218219kt.A01(i) != null) {
            C194918js.A04(this.A00, i, true);
        }
    }

    @Override // X.C8FJ
    public final /* bridge */ /* synthetic */ void DNh(InterfaceC120325cX interfaceC120325cX, int i) {
        throw C00O.createAndThrow();
    }
}
