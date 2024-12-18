package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.StoryPromptType;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.user.model.User;
import java.lang.ref.Reference;

/* renamed from: X.Cl3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28655Cl3 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public ViewOnClickListenerC28655Cl3(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
        this.A05 = str;
        this.A03 = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        Integer num;
        int i;
        int intValue;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1842911824);
                C47983LJh c47983LJh = (C47983LJh) this.A02;
                User user = (User) this.A03;
                boolean CQf = user.CQf();
                String id = user.getId();
                String str = this.A05;
                C14360o3.A0B(str, 2);
                Integer num2 = C05F.A0N;
                if (CQf) {
                    num = C05F.A02;
                } else {
                    num = C05F.A1I;
                }
                c47983LJh.A01.A01(C47983LJh.A00(c47983LJh, null, null, num2, num, null, str, id, null), c47983LJh.A00.A03);
                C45525KDq c45525KDq = (C45525KDq) this.A04;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                C28261Yl.A00.A00(fragmentActivity, fragmentActivity, AbstractC166987dD.A0r(c45525KDq.A08), user, null, AbstractC43591JPw.A00(757), null, user.getUsername());
                i = -1657677780;
                break;
            case 1:
                A05 = C0f9.A05(-486770329);
                C38321qM c38321qM = (C38321qM) this.A03;
                boolean Cff = c38321qM.Cff();
                UserSession userSession = (UserSession) this.A04;
                if (Cff) {
                    Activity activity = (Activity) ((Reference) this.A01).get();
                    if (activity == null) {
                        i = -1422123769;
                        break;
                    } else {
                        C23096AGg.A00.A00(activity, null, C22P.A1S, userSession, null, null, c38321qM, null, false);
                    }
                } else {
                    Reference reference = (Reference) this.A01;
                    Number number = (Number) this.A02;
                    String str2 = this.A05;
                    Context context = (Context) reference.get();
                    if (context != null) {
                        int A0A = AbstractC13880nE.A0A(context);
                        Context context2 = (Context) reference.get();
                        if (context2 != null) {
                            int A09 = AbstractC13880nE.A09(context2);
                            RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
                            float f = A09;
                            RectF rectF2 = new RectF(0.0f, 0.0f, A0A, f);
                            rectF2.offsetTo(0.0f, f);
                            Activity activity2 = (Activity) reference.get();
                            if (activity2 != null) {
                                if (number == null) {
                                    intValue = 0;
                                } else {
                                    intValue = number.intValue();
                                }
                                AbstractC35183Ffa.A02(activity2, rectF2, rectF, userSession, null, c38321qM, str2, null, intValue, false);
                            }
                        }
                    }
                }
                i = -2133293474;
                break;
            case 2:
                A05 = C0f9.A05(1352533047);
                LKo lKo = LKo.A00;
                UserSession userSession2 = (UserSession) this.A04;
                lKo.A06((FragmentActivity) this.A01, EnumC25577BSp.NOTE_THREE_DOT, (InterfaceC11380iw) this.A02, userSession2, (ContentNoteMetadata) this.A03, this.A05, false);
                i = 104706610;
                break;
            case 3:
                A05 = C0f9.A05(-1951649182);
                C28196Cbq c28196Cbq = C28196Cbq.A00;
                UserSession userSession3 = (UserSession) this.A04;
                Activity activity3 = (Activity) this.A01;
                C22P c22p = C22P.A4l;
                CameraTool cameraTool = (CameraTool) this.A02;
                String str3 = this.A05;
                PromptStickerModel promptStickerModel = (PromptStickerModel) this.A03;
                String text = promptStickerModel.A00.getText();
                if (promptStickerModel.A03() != StoryPromptType.A0C) {
                    promptStickerModel = null;
                }
                c28196Cbq.A00(activity3, c22p, cameraTool, userSession3, promptStickerModel, str3, text);
                i = 678878276;
                break;
            case 4:
                A05 = C0f9.A05(2081848096);
                C28196Cbq c28196Cbq2 = C28196Cbq.A00;
                UserSession userSession4 = (UserSession) this.A04;
                Activity activity4 = (Activity) this.A01;
                C22P c22p2 = C22P.A4l;
                CameraTool cameraTool2 = (CameraTool) this.A02;
                String str4 = this.A05;
                PromptStickerModel promptStickerModel2 = (PromptStickerModel) this.A03;
                String text2 = promptStickerModel2.A00.getText();
                if (promptStickerModel2.A03() != StoryPromptType.A0A) {
                    promptStickerModel2 = null;
                }
                c28196Cbq2.A00(activity4, c22p2, cameraTool2, userSession4, promptStickerModel2, str4, text2);
                i = -174524039;
                break;
            default:
                A05 = C0f9.A05(-2102146218);
                C28196Cbq c28196Cbq3 = C28196Cbq.A00;
                UserSession userSession5 = (UserSession) this.A04;
                Activity activity5 = (Activity) this.A01;
                C22P c22p3 = C22P.A0I;
                CameraTool cameraTool3 = (CameraTool) this.A02;
                String str5 = this.A05;
                PromptStickerModel promptStickerModel3 = (PromptStickerModel) this.A03;
                String text3 = promptStickerModel3.A00.getText();
                if (promptStickerModel3.A03() != StoryPromptType.A09) {
                    promptStickerModel3 = null;
                }
                c28196Cbq3.A00(activity5, c22p3, cameraTool3, userSession5, promptStickerModel3, str5, text3);
                i = 1595468637;
                break;
        }
        C0f9.A0C(i, A05);
    }
}
