package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.request.response.GroupLinkPreviewResponse$Success;

/* renamed from: X.Ebt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32789Ebt extends AbstractC34695FQg {
    public final C50679MYx A00;
    public final C50679MYx A01;
    public final UserSession A02;
    public final C33091Eir A03;
    public final C34702FQn A04;
    public final GroupLinkPreviewResponse$Success A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C32789Ebt(C50679MYx c50679MYx, C50679MYx c50679MYx2, UserSession userSession, EnumC33373Ep6 enumC33373Ep6, C33091Eir c33091Eir, C34702FQn c34702FQn, GroupLinkPreviewResponse$Success groupLinkPreviewResponse$Success, String str) {
        super(c50679MYx, c50679MYx2, userSession, enumC33373Ep6, c33091Eir, c34702FQn, groupLinkPreviewResponse$Success);
        String str2;
        this.A02 = userSession;
        this.A03 = c33091Eir;
        this.A00 = c50679MYx;
        this.A01 = c50679MYx2;
        this.A06 = str;
        this.A05 = groupLinkPreviewResponse$Success;
        this.A04 = c34702FQn;
        this.A07 = groupLinkPreviewResponse$Success.A07;
        boolean z = false;
        if (groupLinkPreviewResponse$Success.A0G || ((str2 = groupLinkPreviewResponse$Success.A0A) != null && str2.length() != 0)) {
            z = true;
        }
        this.A08 = z;
    }
}
