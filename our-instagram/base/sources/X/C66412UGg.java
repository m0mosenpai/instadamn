package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UGg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66412UGg extends C2UU {
    public List A00;
    public final InterfaceC11380iw A01;

    public C66412UGg(InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        this.A01 = interfaceC11380iw;
        this.A00 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.widget.TextView, android.view.View, com.instagram.common.ui.base.IgTextView] */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        TextView textView;
        View.OnClickListener onClickListener;
        LinearLayout linearLayout;
        C14360o3.A0B(c3oo, 0);
        Object obj = this.A00.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0 && itemViewType != 1) {
            if (itemViewType != 2) {
                if (itemViewType != 3) {
                    if (itemViewType != 4) {
                        if (itemViewType == 6) {
                            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsPromotionActionRowViewModel");
                            C69096Vhm c69096Vhm = (C69096Vhm) obj;
                            String str2 = c69096Vhm.A02;
                            int i2 = c69096Vhm.A00;
                            onClickListener = c69096Vhm.A01;
                            ?? r1 = ((C66448UHy) c3oo).A00;
                            r1.setText(str2);
                            AbstractC166987dD.A1O(r1.getContext(), r1, i2);
                            linearLayout = r1;
                        } else {
                            return;
                        }
                    } else {
                        UJI uji = (UJI) c3oo;
                        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsPromotionDataRowViewModel");
                        C69215Vji c69215Vji = (C69215Vji) obj;
                        String str3 = c69215Vji.A02;
                        String str4 = c69215Vji.A01;
                        onClickListener = c69215Vji.A00;
                        C14360o3.A0B(str4, 1);
                        uji.A03.setText(str3);
                        uji.A02.setText(str4);
                        uji.A01.setVisibility(0);
                        linearLayout = uji.A00;
                    }
                    C0fQ.A00(onClickListener, linearLayout);
                    return;
                }
                UJI uji2 = (UJI) c3oo;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsPromotionDataRowViewModel");
                C69215Vji c69215Vji2 = (C69215Vji) obj;
                String str5 = c69215Vji2.A02;
                str = c69215Vji2.A01;
                C14360o3.A0B(str, 1);
                uji2.A03.setText(str5);
                textView = uji2.A02;
            } else {
                C66435UHk c66435UHk = (C66435UHk) c3oo;
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsHeaderViewModel");
                str = ((PromoteCampaignControlsHeaderViewModel) obj).A00;
                if (str != null) {
                    textView = c66435UHk.A00;
                } else {
                    C14360o3.A0F("headerText");
                    throw C00O.createAndThrow();
                }
            }
            textView.setText(str);
            return;
        }
        C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.business.promote.model.PromoteCampaignControlsThumbnailViewModel");
        C69097Vhn c69097Vhn = (C69097Vhn) obj;
        ImageUrl imageUrl = c69097Vhn.A01;
        View.OnClickListener onClickListener2 = c69097Vhn.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(onClickListener2, 1);
        RoundedCornerImageView roundedCornerImageView = ((C66449UHz) c3oo).A00;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        C0fQ.A00(onClickListener2, roundedCornerImageView);
        roundedCornerImageView.setUrl(imageUrl, interfaceC11380iw);
        roundedCornerImageView.setVisibility(0);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.3OO, X.UHk] */
    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = AbstractC31177DnL.A0E(viewGroup, 0);
        switch (i) {
            case 0:
                return new C66449UHz(A0E.inflate(R.layout.promote_campaign_controls_thumbnail_view, viewGroup, false), false);
            case 1:
                return new C66449UHz(A0E.inflate(R.layout.promote_campaign_controls_thumbnail_view, viewGroup, false), true);
            case 2:
                View inflate = A0E.inflate(R.layout.row_title_textview, viewGroup, false);
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                C14360o3.A0B(inflate, 1);
                ?? c3oo = new C3OO(inflate);
                c3oo.A00 = (TitleTextView) AbstractC166997dE.A0R(inflate, R.id.row_header_textview);
                return c3oo;
            case 3:
            case 4:
                return new UJI(A0E.inflate(R.layout.promote_campaign_controls_row, viewGroup, false));
            case 5:
                return new C66447UHx(A0E.inflate(R.layout.promote_campaign_controls_divider, viewGroup, false));
            case 6:
                return new C66448UHy(A0E.inflate(R.layout.promote_campaign_controls_action_row, viewGroup, false));
            default:
                throw new IllegalArgumentException("Unknown View Type");
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(564866322);
        int size = this.A00.size();
        C0f9.A0A(-1415943059, A03);
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(-1156292873);
        Object obj = this.A00.get(i);
        if (obj instanceof C69097Vhn) {
            i2 = AbstractC167007dF.A1M(((C69097Vhn) obj).A02 ? 1 : 0);
        } else if (obj instanceof PromoteCampaignControlsHeaderViewModel) {
            i2 = 2;
        } else if (obj instanceof C69215Vji) {
            i2 = 3;
            if (((C69215Vji) obj).A03) {
                i2 = 4;
            }
        } else {
            Object obj2 = null;
            if (obj instanceof String) {
                obj2 = obj;
            }
            if (C14360o3.A0K(obj2, "divider")) {
                i2 = 5;
            } else if (obj instanceof C69096Vhm) {
                i2 = 6;
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown View Model");
                C0f9.A0A(4527972, A03);
                throw illegalArgumentException;
            }
        }
        C0f9.A0A(2032749110, A03);
        return i2;
    }
}
