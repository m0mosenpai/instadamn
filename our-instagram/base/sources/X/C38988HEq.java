package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.HEq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38988HEq extends AbstractC65632xz {
    public final boolean A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
    }

    public C38988HEq(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(7889590);
        AbstractC167017dG.A1P(view, obj);
        if (view.getTag() != null) {
            if (i == 0) {
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.survey.SurveyQuestionViewBinder.Holder");
                IGV igv = (IGV) tag;
                C41101IHs c41101IHs = (C41101IHs) obj;
                int i2 = 0;
                AbstractC167007dF.A1K(igv, c41101IHs);
                TextView textView = igv.A02;
                if (textView != null) {
                    textView.setText(c41101IHs.A01);
                }
                if (C1AD.A06(C06090Tz.A05, 18303037491713185L)) {
                    ImageView imageView = igv.A01;
                    if (imageView != null) {
                        if (!c41101IHs.A03) {
                            i2 = 8;
                        }
                        imageView.setVisibility(i2);
                    }
                    CheckBox checkBox = igv.A00;
                    if (checkBox != null) {
                        checkBox.setChecked(c41101IHs.A03);
                    }
                }
                ImageView imageView2 = igv.A01;
                if (imageView2 != null) {
                    imageView2.setEnabled(c41101IHs.A03);
                }
                ImageView imageView3 = igv.A01;
                if (imageView3 != null) {
                    imageView3.setSelected(c41101IHs.A03);
                }
            } else {
                IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
                C0f9.A0A(187582686, A03);
                throw A14;
            }
        }
        C0f9.A0A(-167453006, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, X.IGV] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        ImageView imageView;
        int A0G = AbstractC25231BEo.A0G(viewGroup, 482523542);
        if (i == 0) {
            Context context = viewGroup.getContext();
            boolean z = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C1AD.A06(c06090Tz, 18303037491713185L);
            LayoutInflater from = LayoutInflater.from(context);
            if (A06) {
                i2 = R.layout.answer_row_new_single_choice;
                if (z) {
                    i2 = R.layout.answer_row_new;
                }
            } else {
                i2 = R.layout.answer_row;
            }
            View A0C = AbstractC31173DnH.A0C(from, viewGroup, i2, false);
            ?? obj = new Object();
            obj.A02 = AbstractC166987dD.A0e(A0C, R.id.text);
            obj.A01 = (ImageView) A0C.findViewById(R.id.check);
            obj.A00 = (CheckBox) A0C.findViewById(R.id.check_box);
            if (C1AD.A06(c06090Tz, 18303037491713185L)) {
                if (!z) {
                    ImageView imageView2 = obj.A01;
                    if (imageView2 != null) {
                        imageView2.setEnabled(false);
                        imageView2.setVisibility(8);
                    }
                } else {
                    TextView textView = obj.A02;
                    if (textView != null) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams.addRule(9, -1);
                        layoutParams.addRule(20, -1);
                        textView.setLayoutParams(layoutParams);
                    }
                }
            } else if (z && (imageView = obj.A01) != null) {
                imageView.setEnabled(false);
            }
            A0C.setTag(obj);
            C0f9.A0A(1248673214, A0G);
            return A0C;
        }
        IllegalStateException A14 = AbstractC166987dD.A14("Unsupported view type");
        C0f9.A0A(-311734117, A0G);
        throw A14;
    }
}
