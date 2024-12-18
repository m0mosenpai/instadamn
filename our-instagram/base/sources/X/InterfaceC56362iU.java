package X;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import kotlin.Deprecated;

/* renamed from: X.2iU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC56362iU {
    View A7w(int i);

    View A7x(View view);

    View A8u(C3LY c3ly);

    View AA9(C3LY c3ly);

    View AAA(C3LY c3ly);

    View AAB(C3LY c3ly);

    void AAC(int i);

    @Deprecated(message = "")
    void AAD(String str);

    @Deprecated(message = "")
    void AAE(String str, View.OnClickListener onClickListener);

    View AAF(View.OnClickListener onClickListener, int i);

    void AHh();

    void ARS(boolean z);

    void ARb(int i, boolean z);

    void ARc(boolean z);

    void ARk(int i, boolean z);

    int AYS();

    IgTextView C94();

    ViewGroup C95();

    void EPD(Drawable drawable);

    void ESl(int i);

    View ESm(int i, int i2, int i3, boolean z);

    View ESn(View view);

    View ESo(View view, int i, int i2, boolean z);

    View ESp(UserSession userSession, int i, int i2, int i3);

    void ETp(boolean z);

    void EaW(CharSequence charSequence, CharSequence charSequence2);

    void EaX(SpannableStringBuilder spannableStringBuilder, View view, CharSequence charSequence);

    void Ect(String str, View.OnClickListener onClickListener);

    void Ef5(CharSequence charSequence);

    IgTextView Eft(int i, int i2);

    void Efu(int i);

    void Efv(SpannableStringBuilder spannableStringBuilder);

    void Efw(View.OnClickListener onClickListener);

    void EgR(int i);

    void EgU();

    ActionButton Eha(View.OnClickListener onClickListener, int i);

    void Ehb(View.OnClickListener onClickListener, Integer num, Integer num2, int i);

    void Ehd(C3LY c3ly);

    void Ehg(C114795Gm c114795Gm);

    ActionButton Ehi(View.OnClickListener onClickListener, int i);

    ActionButton Ehj(C31722DwR c31722DwR);

    void Ehk(String str);

    SearchEditText Ehl();

    AnimatedHintsTextLayout Ehm(int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7);

    void Ehq(InterfaceC60092or interfaceC60092or);

    void EkF(boolean z);

    void EkG(boolean z);

    void EkH(View.OnClickListener onClickListener, boolean z);

    void EkS(boolean z);

    void EkT(View.OnClickListener onClickListener, boolean z);

    void Eka(boolean z);

    void setIsLoading(boolean z);

    void setTitle(String str);
}
