package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;

/* renamed from: X.MIl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50282MIl extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ DirectShareTarget A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50282MIl(UserSession userSession, ImageUrl imageUrl, DirectShareTarget directShareTarget, User user, String str, String str2, String str3, String str4, long j, boolean z) {
        super(1);
        this.A03 = directShareTarget;
        this.A01 = userSession;
        this.A07 = str;
        this.A00 = j;
        this.A08 = str2;
        this.A06 = str3;
        this.A04 = user;
        this.A05 = str4;
        this.A02 = imageUrl;
        this.A09 = z;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        InterfaceC83713oG interfaceC83713oG = (InterfaceC83713oG) obj;
        DirectShareTarget directShareTarget = this.A03;
        if (interfaceC83713oG instanceof InterfaceC2056098k) {
            directShareTarget = new DirectShareTarget(interfaceC83713oG, (PendingRecipient) AbstractC166987dD.A16(Collections.unmodifiableList(directShareTarget.A0Q)));
        }
        C7TM A02 = AbstractC140396Wt.A02(this.A01, directShareTarget);
        String str = this.A07;
        long j = this.A00;
        String str2 = this.A08;
        String str3 = this.A06;
        A02.ENH(this.A02, directShareTarget, null, this.A04, str, str2, str3, null, this.A05, j, this.A09);
        return C0eB.A00;
    }
}
