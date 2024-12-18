package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes8.dex */
public final class KEN extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(4).length;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C47607L0s c47607L0s = (C47607L0s) obj;
        AbstractC167017dG.A1N(anonymousClass306, c47607L0s);
        anonymousClass306.A7a(c47607L0s.A00.intValue());
    }

    public KEN(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        View.OnClickListener onClickListener;
        IgTextView igTextView;
        int A03 = C0f9.A03(610624553);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 3) {
                if (A04 != 2) {
                    if (A04 == 1) {
                        Object tag = view.getTag();
                        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteSeeMoreButtonViewBinder.Holder");
                        C47267Kue c47267Kue = (C47267Kue) tag;
                        C47607L0s c47607L0s = (C47607L0s) obj;
                        C14360o3.A0B(c47267Kue, 0);
                        C14360o3.A0B(c47607L0s, 1);
                        CharSequence charSequence = c47607L0s.A02;
                        if (charSequence != null) {
                            c47267Kue.A00.setText(charSequence);
                        }
                        onClickListener = c47607L0s.A01;
                        igTextView = c47267Kue.A00;
                    } else {
                        B4Z A00 = B4Z.A00();
                        C0f9.A0A(-2006164894, A03);
                        throw A00;
                    }
                } else {
                    Object tag2 = view.getTag();
                    C14360o3.A0C(tag2, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromotePrimaryActionRowTextButtonViewBinder.Holder");
                    C47266Kud c47266Kud = (C47266Kud) tag2;
                    C47607L0s c47607L0s2 = (C47607L0s) obj;
                    C14360o3.A0B(c47266Kud, 0);
                    C14360o3.A0B(c47607L0s2, 1);
                    CharSequence charSequence2 = c47607L0s2.A02;
                    if (charSequence2 != null) {
                        c47266Kud.A00.setText(charSequence2);
                    }
                    onClickListener = c47607L0s2.A01;
                    igTextView = c47266Kud.A00;
                }
            } else {
                Object tag3 = view.getTag();
                C14360o3.A0C(tag3, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteErrorOrDestructiveActionRowTextButtonViewBinder.Holder");
                C47262KuZ c47262KuZ = (C47262KuZ) tag3;
                C47607L0s c47607L0s3 = (C47607L0s) obj;
                C14360o3.A0B(c47262KuZ, 0);
                C14360o3.A0B(c47607L0s3, 1);
                CharSequence charSequence3 = c47607L0s3.A02;
                if (charSequence3 != null) {
                    c47262KuZ.A00.setText(charSequence3);
                }
                onClickListener = c47607L0s3.A01;
                igTextView = c47262KuZ.A00;
            }
        } else {
            Object tag4 = view.getTag();
            C14360o3.A0C(tag4, "null cannot be cast to non-null type com.instagram.business.promote.binder.PromoteTextButtonViewBinder.Holder");
            C47269Kug c47269Kug = (C47269Kug) tag4;
            C47607L0s c47607L0s4 = (C47607L0s) obj;
            C14360o3.A0B(c47269Kug, 0);
            C14360o3.A0B(c47607L0s4, 1);
            CharSequence charSequence4 = c47607L0s4.A02;
            if (charSequence4 != null) {
                c47269Kug.A00.setText(charSequence4);
            }
            onClickListener = c47607L0s4.A01;
            igTextView = c47269Kug.A00;
        }
        C0fQ.A00(onClickListener, igTextView);
        C0f9.A0A(-1777658998, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        IgTextView A0N;
        Object c47269Kug;
        int A03 = C0f9.A03(-328002904);
        C14360o3.A0B(viewGroup, 1);
        int A04 = JQ0.A04(4, i);
        if (A04 != 0) {
            if (A04 != 3) {
                if (A04 != 2) {
                    if (A04 == 1) {
                        A0N = JQ0.A0N(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_see_more_button_view);
                        c47269Kug = new C47267Kue(A0N);
                    } else {
                        B4Z A00 = B4Z.A00();
                        C0f9.A0A(-754015295, A03);
                        throw A00;
                    }
                } else {
                    A0N = JQ0.A0N(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_primary_action_row_text_button_view);
                    c47269Kug = new C47266Kud(A0N);
                }
            } else {
                A0N = JQ0.A0N(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_error_or_distructive_action_row_text_button_view);
                c47269Kug = new C47262KuZ(A0N);
            }
        } else {
            A0N = JQ0.A0N(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.promote_recycler_text_button_view);
            c47269Kug = new C47269Kug(A0N);
        }
        A0N.setTag(c47269Kug);
        C0f9.A0A(-723057140, A03);
        return A0N;
    }
}
