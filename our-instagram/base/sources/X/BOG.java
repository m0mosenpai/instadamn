package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* loaded from: classes5.dex */
public final class BOG {
    public final ImageView A00;
    public final BOH A01;
    public final ViewOnTouchListenerC97504Zk A02;
    public final TranslatedCaptionsStickerViewBinder$Holder A03;
    public final C4ZU A04;
    public final C144296fB A05;
    public final C97564Zr A06;
    public final C4Zp A07;
    public final C97674a2 A08;
    public final C97624Zx A09;
    public final C144216f3 A0A;
    public final Context A0B;
    public final ViewStub A0C;

    public BOG(View view) {
        ViewStub viewStub;
        Context A0L = AbstractC166997dE.A0L(view);
        this.A0B = A0L;
        this.A02 = new ViewOnTouchListenerC97504Zk(view);
        this.A07 = new C4Zp((ViewStub) view.findViewById(R.id.polls_sticker_stub));
        this.A06 = new C97564Zr(AbstractC56372iV.A00(view.findViewById(R.id.poll_v2_sticker_stub)));
        this.A09 = new C97624Zx(AbstractC56372iV.A00(view.requireViewById(R.id.quiz_sticker_stub)));
        this.A08 = new C97674a2(A0L, AbstractC56372iV.A00(view.requireViewById(R.id.prompt_sticker_stub)));
        this.A01 = new BOH(A0L, AbstractC56372iV.A00(view.findViewById(R.id.visual_comment_reply_sticker_stub)));
        View findViewById = view.findViewById(R.id.question_sticker_stub);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        this.A0A = new C144216f3(new C57012jc(viewStub));
        this.A05 = new C144296fB(AbstractC56372iV.A00(view.findViewById(R.id.chat_sticker_stub)));
        ViewStub viewStub2 = (ViewStub) AbstractC166987dD.A0c(view, R.id.clips_item_confetti_stub);
        this.A0C = viewStub2;
        View inflate = viewStub2.inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageView");
        this.A00 = (ImageView) inflate;
        this.A03 = new TranslatedCaptionsStickerViewBinder$Holder(AbstractC56372iV.A00(view.findViewById(R.id.translated_captions_sticker_stub)));
        this.A04 = new C4ZU(AbstractC56372iV.A00(view.findViewById(R.id.translated_text_sticker_stub)));
    }
}
