package X;

import com.facebook.papaya.client.transport.ITransport;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.OEr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54714OEr {
    public final ITransport A00;
    public final C54674ODa A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final boolean A07;

    public C54714OEr(ITransport iTransport, C54674ODa c54674ODa, UserSession userSession, String str, String str2, List list, List list2, boolean z) {
        AbstractC37302Gc3.A1U(list, list2);
        C14360o3.A0B(c54674ODa, 7);
        this.A02 = userSession;
        this.A07 = z;
        this.A05 = list;
        this.A06 = list2;
        this.A00 = iTransport;
        this.A01 = c54674ODa;
        this.A04 = str;
        this.A03 = str2;
    }
}
