package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntities;
import java.util.List;

/* loaded from: classes7.dex */
public final class HID extends AbstractC66412zI {
    public final UserSession A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        SpannableStringBuilder spannableStringBuilder;
        C42301IoP c42301IoP = (C42301IoP) interfaceC66482zP;
        C38464Gvl c38464Gvl = (C38464Gvl) c3oo;
        boolean A1R = AbstractC167007dF.A1R(0, c42301IoP, c38464Gvl);
        SpannableStringBuilder A01 = AbstractC37300Gc1.A01();
        C51750MtZ c51750MtZ = c42301IoP.A00;
        int size = ((List) c51750MtZ.A00).size();
        for (int i = 0; i < size; i++) {
            TextWithEntitiesBlockDict textWithEntitiesBlockDict = (TextWithEntitiesBlockDict) ((List) c51750MtZ.A00).get(i);
            TextWithEntities textWithEntities = textWithEntitiesBlockDict.A00;
            if (textWithEntities != null && textWithEntities.A00 != null) {
                int color = c38464Gvl.A00.getColor(R.color.badge_color);
                C40964ICl c40964ICl = new C40964ICl(c38464Gvl);
                String str = textWithEntities.A02;
                if (str == null) {
                    str = "";
                }
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new C31752Dx5(color, A1R ? 1 : 0, c40964ICl, textWithEntities), 0, spannableString.length(), 17);
                spannableStringBuilder = spannableString;
            } else {
                spannableStringBuilder = IQ4.A01(c38464Gvl.A00, textWithEntitiesBlockDict);
            }
            A01.append((CharSequence) spannableStringBuilder);
            if (i != AbstractC25226BEj.A05((List) c51750MtZ.A00)) {
                A01.append((CharSequence) " ");
            }
        }
        AbstractC31176DnK.A1G(c38464Gvl.A01, A01);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42301IoP.class;
    }

    public HID(UserSession userSession) {
        this.A00 = userSession;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        UserSession userSession = this.A00;
        boolean A1U = AbstractC167007dF.A1U(userSession);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38464Gvl(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.tagging_feed_text_block, A1U), userSession);
    }
}
