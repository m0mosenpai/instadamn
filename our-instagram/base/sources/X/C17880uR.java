package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.0uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17880uR implements InterfaceC12870lZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C18920wW A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C17870uQ A03;

    public C17880uR(Context context, C18920wW c18920wW, UserSession userSession, C17870uQ c17870uQ) {
        this.A03 = c17870uQ;
        this.A00 = context;
        this.A01 = c18920wW;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(230937997);
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.0ub
            {
                super(109, 5, true, false);
            }

            /* JADX WARN: Removed duplicated region for block: B:109:0x0189  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00fe  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x013f  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 423
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C17980ub.run():void");
            }
        });
        C0f9.A0A(153412948, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1500647429, C0f9.A03(-609342083));
    }
}
