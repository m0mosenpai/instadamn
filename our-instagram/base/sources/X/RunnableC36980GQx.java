package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;

/* renamed from: X.GQx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36980GQx implements Runnable {
    public final /* synthetic */ C38686GzR A00;
    public final /* synthetic */ ImmutableList A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public RunnableC36980GQx(C38686GzR c38686GzR, ImmutableList immutableList, UserSession userSession, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A01 = immutableList;
        this.A04 = str;
        this.A03 = str2;
        this.A00 = c38686GzR;
        this.A05 = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25671My A00 = AbstractC25651Mw.A00(this.A02);
        ImmutableList immutableList = this.A01;
        A00.E4s(new C36113Fwn(this.A00, this.A04, this.A03, this.A05, immutableList));
    }
}
