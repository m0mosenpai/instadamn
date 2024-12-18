package X;

import android.content.Context;
import android.graphics.Color;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModel;
import com.instagram.reels.questionv2.model.QuestionMediaResponseModelIntf;

/* loaded from: classes7.dex */
public abstract class I5Q {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C41628IbJ c41628IbJ, JHI jhi, C38455Gvc c38455Gvc, Integer num, int i) {
        Integer num2;
        AbstractC25234BEr.A0j(0, c38455Gvc, jhi, userSession, num);
        C14360o3.A0B(interfaceC11380iw, 6);
        C38515Gwb c38515Gwb = c38455Gvc.A02;
        QuestionResponsesModelIntf questionResponsesModelIntf = c41628IbJ.A01;
        C14360o3.A0B(questionResponsesModelIntf, 0);
        Color.parseColor(questionResponsesModelIntf.getTextColor());
        I5P.A00(c41628IbJ, jhi, c38515Gwb, num, i);
        if (c41628IbJ.A00.BRR() == null) {
            c38455Gvc.A01.setVisibility(8);
            return;
        }
        Context A05 = AbstractC31172DnG.A05(c38455Gvc);
        int dimensionPixelSize = A05.getResources().getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width);
        QuestionMediaResponseModelIntf BRR = c41628IbJ.A00.BRR();
        C14360o3.A0C(BRR, "null cannot be cast to non-null type com.instagram.reels.questionv2.model.QuestionMediaResponseModel");
        QuestionMediaResponseModel questionMediaResponseModel = (QuestionMediaResponseModel) BRR;
        Integer num3 = questionMediaResponseModel.A04;
        int i2 = EnumC40111tc.A0a.A00;
        if (num3 != null && num3.intValue() == i2) {
            c38455Gvc.A00.setVisibility(0);
        }
        ImageInfo imageInfo = questionMediaResponseModel.A00;
        if (imageInfo != null) {
            Integer num4 = questionMediaResponseModel.A06;
            if (num4 != null) {
                int intValue = num4.intValue();
                Integer num5 = questionMediaResponseModel.A05;
                if (num5 != null) {
                    int intValue2 = num5.intValue();
                    if (intValue2 > 0 && intValue > 0 && intValue == intValue2) {
                        num2 = C05F.A0C;
                    } else {
                        num2 = C05F.A01;
                    }
                    ExtendedImageUrl A04 = AbstractC40161tk.A04(imageInfo, num2, dimensionPixelSize);
                    InterfaceC56392iX interfaceC56392iX = c38455Gvc.A01;
                    if (A04 != null) {
                        interfaceC56392iX.setVisibility(0);
                        ((IgProgressImageView) interfaceC56392iX.getView().requireViewById(R.id.question_response_card_media_preview)).setUrl(A04, interfaceC11380iw);
                        c38515Gwb.A0E.setBackgroundResource(R.drawable.question_response_media_card_outline);
                        AbstractC166987dD.A1O(A05, c38515Gwb.A08, AbstractC53242c7.A0A(A05));
                        return;
                    }
                    interfaceC56392iX.setVisibility(8);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
