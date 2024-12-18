package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.ui.widget.editphonenumber.EditPhoneNumberView;

/* loaded from: classes8.dex */
public final class KEU extends AbstractC65632xz {
    public final Context A00;
    public final AbstractC10360h2 A01;
    public final UserSession A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(4).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        throw AbstractC166987dD.A15("getType");
    }

    public KEU(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = abstractC10360h2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(2003403690);
        C14360o3.A0B(view, 1);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 1) {
                if (A04 != 2) {
                    if (A04 == 3) {
                        Context context = this.A00;
                        UserSession userSession = this.A02;
                        AbstractC10360h2 abstractC10360h2 = this.A01;
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePhoneEditTextViewBinder.Holder");
                        C14360o3.A0B(context, 0);
                        C14360o3.A0B(userSession, 1);
                        C14360o3.A0B(abstractC10360h2, 2);
                        C14360o3.A0B(tag, 3);
                        C14360o3.A0B(null, 4);
                        throw C00O.createAndThrow();
                    }
                    B4Z A00 = B4Z.A00();
                    C0f9.A0A(-1141745542, A03);
                    throw A00;
                }
                Context context2 = this.A00;
                C14360o3.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteEmailEditTextViewBinder.Holder");
                C14360o3.A0B(context2, 0);
                Drawable drawable = context2.getDrawable(R.drawable.instagram_error_outline_16);
                if (drawable != null) {
                    AbstractC25231BEo.A0x(context2, drawable, AbstractC53242c7.A03(context2));
                    Drawable drawable2 = context2.getDrawable(R.drawable.instagram_circle_check_outline_16);
                    if (drawable2 != null) {
                        AbstractC25231BEo.A0x(context2, drawable2, AbstractC53242c7.A0H(context2, R.attr.igds_color_success));
                        throw AbstractC166987dD.A15("getHint");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            C14360o3.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteNameEditTextViewBinder.Holder");
            throw AbstractC166987dD.A15("getHint");
        }
        C14360o3.A0C(view.getTag(), "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSimpleEditTextViewBinder.Holder");
        throw AbstractC166987dD.A15("getHint");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Object c47268Kuf;
        View view;
        int A03 = C0f9.A03(-1303101236);
        C14360o3.A0B(viewGroup, 1);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 1) {
                if (A04 != 2) {
                    if (A04 == 3) {
                        View inflate = AbstractC31172DnG.A09(this.A00).inflate(R.layout.promote_recycler_phone_edit_text_view, viewGroup, false);
                        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.ui.widget.editphonenumber.EditPhoneNumberView");
                        EditPhoneNumberView editPhoneNumberView = (EditPhoneNumberView) inflate;
                        c47268Kuf = new C47265Kuc(editPhoneNumberView);
                        view = editPhoneNumberView;
                    } else {
                        B4Z A00 = B4Z.A00();
                        C0f9.A0A(458070563, A03);
                        throw A00;
                    }
                } else {
                    View A07 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_email_edit_text_view, false);
                    c47268Kuf = new C47261KuY((IgEditText) AbstractC166997dE.A0R(A07, R.id.edit_text));
                    view = A07;
                }
            } else {
                View A072 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_name_edit_text_view, false);
                c47268Kuf = new C47264Kub((IgEditText) AbstractC166997dE.A0R(A072, R.id.edit_text));
                view = A072;
            }
        } else {
            View A073 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_simple_edit_text_view, false);
            c47268Kuf = new C47268Kuf((IgEditText) AbstractC166997dE.A0R(A073, R.id.edit_text));
            view = A073;
        }
        view.setTag(c47268Kuf);
        C0f9.A0A(1916077829, A03);
        return view;
    }
}
