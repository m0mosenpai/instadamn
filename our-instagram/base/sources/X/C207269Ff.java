package X;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9Ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207269Ff extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207269Ff(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = z;
        this.A02 = obj4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        final UserSession userSession;
        InterfaceC60442pS interfaceC60442pS;
        boolean z;
        InterfaceC92464Cd interfaceC92464Cd;
        Object AcJ;
        int i;
        Object AhG;
        int i2;
        switch (this.A00) {
            case 0:
                C22967AAl c22967AAl = C220049nq.A00;
                C7MW c7mw = (C7MW) this.A04;
                UserSession userSession2 = c7mw.A07;
                C7ZX c7zx = c7mw.A08;
                AnonymousClass988 anonymousClass988 = c7mw.A09;
                InterfaceC11380iw interfaceC11380iw = c7mw.A06;
                C7DK c7dk = (C7DK) this.A02;
                C79Z c79z = (C79Z) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A0C(c79z, "null cannot be cast to non-null type com.instagram.direct.messagethread.contextreplydecorations.ContextReplyMessageDecorationsItemDefinition<com.instagram.direct.messagethread.gif.GifContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>, com.instagram.direct.messagethread.genericxma.GenericXmaContentViewHolder<com.instagram.direct.messagethread.interaction.ItemInteractionListener>>");
                return c22967AAl.A00(interfaceC11380iw, userSession2, c79z, c7zx, (C163547Tr) this.A03, anonymousClass988, c7dk, this.A05);
            case 1:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                final InterfaceC92434Ca AZI = ((InterfaceC686136y) this.A02).AZI();
                C14360o3.A0B(AZI, 0);
                interfaceC92464Cd = new InterfaceC92464Cd() { // from class: X.4Cc
                    @Override // X.InterfaceC92464Cd
                    public final void D19(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb, C2Fb c2Fb) {
                        C14360o3.A0B(c38321qM, 0);
                        InterfaceC92434Ca.this.Cv9(motionEvent, c81373k7, c38321qM, c75113Zb, c2Fb, new DGY(c81373k7, 15));
                    }

                    @Override // X.InterfaceC92464Cd
                    public final /* synthetic */ void ED7(View view, C38321qM c38321qM, C75113Zb c75113Zb) {
                    }

                    @Override // X.InterfaceC92464Cd
                    public final void D18(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb) {
                        InterfaceC92434Ca.this.Cv9(motionEvent, c81373k7, c38321qM, c75113Zb, C2Fb.A3F, new C206939Dy(c81373k7, 22));
                    }
                };
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 2:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((InterfaceC688337u) this.A02).AcJ();
                i = 0;
                C14360o3.A0B(AcJ, 0);
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 3:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AhG = ((InterfaceC688437v) this.A02).AhG();
                i2 = 0;
                C14360o3.A0B(AhG, 0);
                interfaceC92464Cd = new Aj4(AhG, i2);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 4:
                return new C9I3((Context) this.A01, (UserSession) this.A03, ((InterfaceC686136y) this.A02).Ap6(), ((AnonymousClass398) this.A04).A04, null, this.A05);
            case 5:
                return new C39V((Activity) this.A02, (Context) this.A01, ((AnonymousClass398) this.A04).A04, (UserSession) this.A03, this.A05);
            case 6:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((InterfaceC688537w) this.A02).B95();
                C14360o3.A0B(AcJ, 0);
                i = 1;
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 7:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((InterfaceC688637x) this.A02).BF2();
                C14360o3.A0B(AcJ, 0);
                i = 3;
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 8:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((InterfaceC686136y) this.A02).BES();
                C14360o3.A0B(AcJ, 0);
                i = 2;
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 9:
                return new C48Z((Activity) this.A02, (Context) this.A01, (UserSession) this.A04, (C57332k8) this.A03, this.A05);
            case 10:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((InterfaceC688737y) this.A02).BZ1();
                C14360o3.A0B(AcJ, 0);
                i = 4;
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 11:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                final BC7 BZ6 = ((InterfaceC688837z) this.A02).BZ6();
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(BZ6, 1);
                interfaceC92464Cd = new InterfaceC92464Cd() { // from class: X.9I4
                    @Override // X.InterfaceC92464Cd
                    public final void ED7(View view, C38321qM c38321qM, C75113Zb c75113Zb) {
                        C14360o3.A0B(c75113Zb, 1);
                        c75113Zb.A2x = true;
                        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                        InterfaceC16530ry interfaceC16530ry = A00.A6f;
                        C0YR[] c0yrArr = C23031Ai.A8c;
                        AbstractC167027dH.A16(A00, interfaceC16530ry, c0yrArr, 90);
                        long currentTimeMillis = System.currentTimeMillis();
                        A00.A6e.Egi(A00, Long.valueOf(currentTimeMillis), c0yrArr[91]);
                    }

                    @Override // X.InterfaceC92464Cd
                    public final void D18(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb) {
                        AbstractC167017dG.A1N(c38321qM, c75113Zb);
                        BZ6.DWk(c38321qM, c75113Zb);
                    }

                    @Override // X.InterfaceC92464Cd
                    public final void D19(MotionEvent motionEvent, C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb, C2Fb c2Fb) {
                        AbstractC167017dG.A1N(c38321qM, c75113Zb);
                        BZ6.DWk(c38321qM, c75113Zb);
                    }
                };
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((InterfaceC686136y) this.A02).BhU();
                C14360o3.A0B(AcJ, 0);
                i = 5;
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AcJ = ((AnonymousClass380) this.A02).Buj();
                C14360o3.A0B(AcJ, 0);
                i = 6;
                interfaceC92464Cd = new C42484IrP(AcJ, i);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            case 14:
                Context context2 = (Context) this.A01;
                UserSession userSession3 = (UserSession) this.A03;
                AnonymousClass398 anonymousClass398 = (AnonymousClass398) this.A04;
                InterfaceC60442pS interfaceC60442pS2 = anonymousClass398.A04;
                C07X c07x = anonymousClass398.A00;
                boolean z2 = this.A05;
                InterfaceC686136y interfaceC686136y = (InterfaceC686136y) this.A02;
                return new C2V(context2, c07x, userSession3, anonymousClass398.A02, interfaceC686136y.BS6(), interfaceC686136y.B5c(), interfaceC60442pS2, z2);
            case Process.SIGTERM /* 15 */:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AhG = ((C37T) this.A02).CD9();
                C14360o3.A0B(AhG, 0);
                i2 = 2;
                interfaceC92464Cd = new Aj4(AhG, i2);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
            default:
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                interfaceC60442pS = ((AnonymousClass398) this.A04).A04;
                z = this.A05;
                AhG = ((C37I) this.A02).CDB();
                C14360o3.A0B(AhG, 0);
                i2 = 3;
                interfaceC92464Cd = new Aj4(AhG, i2);
                return new C92474Ce(context, userSession, interfaceC92464Cd, interfaceC60442pS, z);
        }
    }
}
