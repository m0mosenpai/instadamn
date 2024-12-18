package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.prompts.DirectPromptTypes;

/* renamed from: X.G2c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36350G2c implements GXW {
    public final UserSession A00;
    public final InterfaceC165267aF A01;

    public C36350G2c(UserSession userSession, InterfaceC165267aF interfaceC165267aF) {
        C14360o3.A0B(interfaceC165267aF, 1);
        this.A01 = interfaceC165267aF;
        this.A00 = userSession;
    }

    @Override // X.GXW
    public final boolean CoA(android.net.Uri uri, C32051E6d c32051E6d) {
        boolean A1R = AbstractC167007dF.A1R(0, uri, c32051E6d);
        if (!"direct_media_collection".equalsIgnoreCase(uri.getHost())) {
            return false;
        }
        String queryParameter = uri.getQueryParameter("collection_type");
        String queryParameter2 = uri.getQueryParameter("collection_id");
        String queryParameter3 = uri.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (queryParameter != null) {
            DirectPromptTypes A01 = C7D2.A01(queryParameter);
            DirectPromptTypes directPromptTypes = DirectPromptTypes.A08;
            UserSession userSession = this.A00;
            if (A01 == directPromptTypes) {
                C25531Mh A03 = C25531Mh.A03(new FRk(AbstractC31171DnF.A0D("CardGalleryDeeplinkHandler"), userSession).A00);
                if (AbstractC25226BEj.A1Z(A03)) {
                    A03.A0M(EnumC33511Erk.TAP, "action");
                    AbstractC31179DnN.A13(EnumC33506Erf.XMA, A03, queryParameter2, queryParameter3);
                }
            } else {
                AbstractC34064F1r.A00(userSession, A01);
            }
        }
        this.A01.Cqd(uri.getQueryParameter("collection_type"), queryParameter2, queryParameter3, uri.getQueryParameter("seed_message_sender_id"), c32051E6d.A08, c32051E6d.A07, c32051E6d.A09, c32051E6d.A0C, null, c32051E6d.A0B);
        return A1R;
    }
}
