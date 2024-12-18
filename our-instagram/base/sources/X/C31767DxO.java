package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.slidecardpageadapter.SlideCardViewModel;
import java.util.List;

/* renamed from: X.DxO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31767DxO extends BaseAdapter {
    public int A00;
    public boolean A01;
    public boolean A02;
    public final List A03;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = AbstractC25228BEl.A0P(viewGroup).inflate(R.layout.slide_card_with_headline, viewGroup, false);
        }
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(view, R.id.headline);
        SlideCardViewModel slideCardViewModel = (SlideCardViewModel) this.A03.get(i);
        View findViewById = view.findViewById(R.id.image);
        View findViewById2 = view.findViewById(R.id.circular_image);
        int i2 = slideCardViewModel.A01;
        if (i2 != 0) {
            A0Q.setImageDrawable(AbstractC56412ia.A00(viewGroup.getResources(), i2));
        } else {
            int i3 = slideCardViewModel.A00;
            if (i3 != 0) {
                A0Q.setImageResource(i3);
            } else {
                ImageUrl imageUrl = slideCardViewModel.A05;
                if (imageUrl != null) {
                    A0Q.setCircularImageUrl(imageUrl, null);
                } else {
                    ImageUrl imageUrl2 = slideCardViewModel.A06;
                    if (imageUrl2 != null) {
                        A0Q.setImageURL(imageUrl2, null);
                    } else if (findViewById2 != null && findViewById != null) {
                        findViewById2.setVisibility(8);
                        findViewById.setVisibility(8);
                    }
                }
            }
        }
        String str = slideCardViewModel.A09;
        if (str != null) {
            TextView A0T = AbstractC166997dE.A0T(view, R.id.link2);
            Context context = A0T.getContext();
            AbstractC166987dD.A1O(context, A0T, AbstractC53242c7.A0C(context));
            A0T.setText(str);
            View.OnClickListener onClickListener = slideCardViewModel.A04;
            if (onClickListener != null) {
                C0fQ.A00(onClickListener, A0T);
            }
            A0T.setVisibility(0);
        } else {
            AbstractC31176DnK.A1E(view, R.id.link2, 8);
        }
        CharSequence charSequence = slideCardViewModel.A07;
        if (charSequence != null) {
            A0Q.setDetailText(charSequence);
        }
        View findViewById3 = view.findViewById(R.id.row_divider);
        if (findViewById3 != null) {
            if (this.A01 && slideCardViewModel.A06 == null) {
                findViewById3.setVisibility(0);
            } else {
                findViewById3.setVisibility(8);
            }
        }
        String str2 = slideCardViewModel.A0B;
        if (str2 != null) {
            A0Q.setHeadline(str2);
        }
        String str3 = slideCardViewModel.A0A;
        if (str3 != null) {
            A0Q.setBody(str3, null);
        } else {
            String str4 = slideCardViewModel.A08;
            if (str4 != null) {
                A0Q.setAction(str4, slideCardViewModel.A03);
                return view;
            }
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.A03.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.A03.get(i);
    }

    public C31767DxO(ViewGroup viewGroup, List list, boolean z, boolean z2) {
        int i;
        this.A03 = list;
        this.A01 = z;
        this.A02 = z2;
        DisplayMetrics displayMetrics = AbstractC25228BEl.A0M(viewGroup).getDisplayMetrics();
        int i2 = 0;
        while (true) {
            if (i2 >= this.A03.size()) {
                break;
            }
            View view = getView(i2, null, viewGroup);
            if (view.requireViewById(R.id.placeholder).getVisibility() == 0) {
                this.A00 = -1;
                break;
            }
            view.measure(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE), 0);
            if (this.A00 < view.getMeasuredHeight()) {
                i = view.getMeasuredHeight();
            } else {
                i = this.A00;
            }
            this.A00 = i;
            i2++;
        }
        viewGroup.setLayoutParams(new LinearLayout.LayoutParams(-1, this.A00));
    }
}
