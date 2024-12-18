package X;

import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.MCh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C50133MCh extends C03E implements InterfaceC16820sZ {
    public final /* synthetic */ C49072Lmy A00;
    public final /* synthetic */ C47777L8c A01;
    public final /* synthetic */ C7U0 A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ MessageIdentifier A04;
    public final /* synthetic */ MsysThreadId A05;
    public final /* synthetic */ C40971v4 A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50133MCh(C49072Lmy c49072Lmy, C47777L8c c47777L8c, C7U0 c7u0, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, MsysThreadId msysThreadId, C40971v4 c40971v4, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z) {
        super(0, C0o2.class, "navigateToDirectClipsViewer", "navigateToClipsViewer$navigateToDirectClipsViewer(Ljava/lang/Boolean;Lcom/instagram/direct/fragment/thread/DirectClipsViewerNavigator;Lcom/instagram/model/sponsored/Ad;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/instagram/model/direct/messageid/MessageIdentifier;Ljava/lang/String;Lcom/instagram/direct/fragment/thread/environment/gradientspinner/GradientSpinnerDelegate;ZLcom/instagram/direct/fragment/thread/infra/ClientInfra;Lcom/instagram/model/direct/DirectThreadKey;Lcom/instagram/model/direct/threadkey/impl/MsysThreadId;Ljava/lang/String;)V", 0);
        this.A07 = bool;
        this.A00 = c49072Lmy;
        this.A06 = c40971v4;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A04 = messageIdentifier;
        this.A08 = str4;
        this.A01 = c47777L8c;
        this.A0D = z;
        this.A02 = c7u0;
        this.A03 = directThreadKey;
        this.A05 = msysThreadId;
        this.A0C = str5;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Boolean bool = this.A07;
        C49072Lmy c49072Lmy = this.A00;
        C40971v4 c40971v4 = this.A06;
        String str = this.A0A;
        String str2 = this.A0B;
        String str3 = this.A09;
        MessageIdentifier messageIdentifier = this.A04;
        String str4 = this.A08;
        C49072Lmy.A01(c49072Lmy, this.A01, this.A02, this.A03, messageIdentifier, this.A05, c40971v4, bool, str, str2, str3, str4, this.A0C, this.A0D);
        return C0eB.A00;
    }
}
