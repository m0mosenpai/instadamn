package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class Jo1 extends C2UU {
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final List A06;
    public final Handler A07;
    public final C47248KuL A08;
    public final MQO A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final boolean A0C;

    public Jo1(Activity activity, C47248KuL c47248KuL, MQO mqo, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, int i, int i2, boolean z) {
        float f;
        AbstractC25229BEm.A1J(num, 4, userSession);
        this.A09 = mqo;
        this.A03 = i;
        this.A05 = num;
        this.A04 = i2;
        this.A0C = z;
        this.A08 = c47248KuL;
        this.A0A = interfaceC11380iw;
        this.A0B = userSession;
        this.A06 = AbstractC166987dD.A1E();
        this.A07 = AbstractC167007dF.A0J();
        switch (num.intValue()) {
            case 1:
                f = 0.75f;
                break;
            case 2:
                f = 0.78f;
                break;
            case 3:
            case 4:
                f = 1.0f;
                break;
            case 5:
                f = 0.9f;
                break;
            default:
                f = 0.59f;
                break;
        }
        this.A02 = (int) ((AbstractC13880nE.A0A(activity) - (i * (i2 + 1))) / (i2 * f));
        this.A00 = i2 * 2;
        A00(this);
    }

    public final void A03(List list, boolean z) {
        C14360o3.A0B(list, 0);
        List list2 = this.A06;
        if (list2.size() >= this.A00) {
            int size = list2.size();
            list2.addAll(size - this.A00, list);
            notifyItemRangeChanged(size, list.size());
            if (!z) {
                int size2 = list2.size();
                list2.subList(size2 - this.A00, size2).clear();
                int i = this.A00;
                notifyItemRangeRemoved(size2 - i, i);
                this.A00 = 0;
            }
        }
    }

    public final void A04(List list, boolean z) {
        C14360o3.A0B(list, 0);
        List list2 = this.A06;
        list2.clear();
        if (this.A0C && AbstractC166987dD.A1b(list)) {
            LHy lHy = LHy.A05;
            C14360o3.A08(lHy);
            list2.add(lHy);
        }
        LHy lHy2 = LHy.A04;
        C14360o3.A08(lHy2);
        list2.add(lHy2);
        list2.addAll(list);
        if (z) {
            A00(this);
        }
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C44765Jrm c44765Jrm;
        String str;
        boolean z;
        IgTextView igTextView;
        AttributedAREffect attributedAREffect;
        ProductAREffectContainer productAREffectContainer;
        C14360o3.A0B(c3oo, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 6) {
                if (itemViewType != 2) {
                    if (itemViewType != 3 && itemViewType != 4) {
                        throw AbstractC166987dD.A14("unhandled item type");
                    }
                    return;
                } else {
                    C44755Jrc c44755Jrc = (C44755Jrc) c3oo;
                    if (i % this.A04 == 0) {
                        c44755Jrc.A00();
                        return;
                    } else {
                        this.A07.postDelayed(new RunnableC49833Lze(c44755Jrc), r13 * 600);
                        return;
                    }
                }
            }
            c44765Jrm = (C44765Jrm) c3oo;
            z = AbstractC25229BEm.A1Z(this.A01);
            c44765Jrm.A0A.set(!AbstractC46617Kju.A00(c44765Jrm.A08));
            c44765Jrm.A09.set(false);
            String A0p = AbstractC166997dE.A0p(AbstractC31172DnG.A05(c44765Jrm), 2131953160);
            View view = c44765Jrm.itemView;
            AbstractC37302Gc3.A0o(view.getContext(), view, A0p, 2131953161);
            AbstractC56952jT.A01(c44765Jrm.itemView);
            IgTextView igTextView2 = c44765Jrm.A02;
            if (igTextView2 != null) {
                igTextView2.setText(A0p);
            }
            Drawable drawable = AbstractC31172DnG.A05(c44765Jrm).getDrawable(R.drawable.effect_no_selection);
            if (drawable != null) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                C8FY c8fy = new C8FY(AbstractC25228BEl.A0M(c44765Jrm.itemView), bitmapDrawable.getBitmap());
                c8fy.A02(AbstractC166987dD.A02(bitmapDrawable.getIntrinsicWidth()));
                IgImageView igImageView = c44765Jrm.A04;
                if (igImageView != null) {
                    igImageView.setImageDrawable(c8fy);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            c44765Jrm = (C44765Jrm) c3oo;
            C46520KiJ c46520KiJ = ((LHy) this.A06.get(i)).A00;
            if (c46520KiJ != null) {
                InterfaceC11380iw interfaceC11380iw = this.A0A;
                c44765Jrm.A01 = c46520KiJ;
                c44765Jrm.A0A.set(!AbstractC46617Kju.A00(c44765Jrm.A08));
                AtomicBoolean atomicBoolean = c44765Jrm.A09;
                atomicBoolean.set(false);
                Reel reel = c46520KiJ.A03;
                if (reel == null || (attributedAREffect = reel.A0G) == null || (productAREffectContainer = attributedAREffect.A04) == null || (str = productAREffectContainer.A00.A01.A0e) == null) {
                    str = c46520KiJ.A06;
                }
                C14360o3.A07(str);
                String str2 = c46520KiJ.A07;
                if (str2 != null && (igTextView = c44765Jrm.A03) != null) {
                    igTextView.setText(str2);
                }
                String str3 = c46520KiJ.A08;
                if (str3 != null) {
                    AbstractC56952jT.A03(c44765Jrm.itemView, str3);
                    AbstractC56952jT.A04(c44765Jrm.itemView, C05F.A00);
                }
                View view2 = c44765Jrm.itemView;
                AbstractC37302Gc3.A0o(view2.getContext(), view2, str, 2131953161);
                AbstractC56952jT.A01(c44765Jrm.itemView);
                IgTextView igTextView3 = c44765Jrm.A02;
                if (igTextView3 != null) {
                    igTextView3.setText(str);
                }
                boolean z2 = c46520KiJ.A0A;
                IgImageView igImageView2 = c44765Jrm.A04;
                if (z2) {
                    if (igImageView2 != null) {
                        UserSession userSession = c44765Jrm.A05;
                        Context A0L = AbstractC166997dE.A0L(c44765Jrm.A06);
                        igImageView2.setImageDrawable(new C44363Jj2(A0L, AbstractC43594JPz.A0D(), userSession, AbstractC43592JPx.A0w(c46520KiJ.A00()), AbstractC43594JPz.A05(A0L)));
                    }
                    atomicBoolean.set(true);
                    C44765Jrm.A00(c44765Jrm);
                } else if (igImageView2 != null) {
                    ImageUrl A00 = c46520KiJ.A00();
                    C14360o3.A07(A00);
                    igImageView2.setUrl(A00, interfaceC11380iw);
                }
                z = c46520KiJ.A0B;
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        c44765Jrm.itemView.setSelected(z);
        c44765Jrm.itemView.setAccessibilityDelegate(new UAI(z));
        C44376JjF c44376JjF = c44765Jrm.A07;
        c44376JjF.A04 = z;
        c44376JjF.invalidateSelf();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        LayoutInflater from = LayoutInflater.from(A06);
        if (i != 0) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 6) {
                        throw AbstractC166987dD.A14("unhandled item type");
                    }
                } else {
                    View A0C = AbstractC31173DnH.A0C(from, viewGroup, R.layout.effect_mini_gallery_category_page_header, false);
                    AbstractC13880nE.A0W(A0C, this.A02 / 2);
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    String A0p = AbstractC166997dE.A0p(A06, 2131966705);
                    C14360o3.A0B(A0C, 1);
                    C3OO c3oo = new C3OO(A0C);
                    AbstractC167007dF.A0N(A0C, R.id.mini_gallery_category_page_header_text_view).setText(A0p);
                    return c3oo;
                }
            } else {
                View A0C2 = AbstractC31173DnH.A0C(from, viewGroup, R.layout.camera_effects_view_preview_video_loading_holder, false);
                AbstractC13880nE.A0W(A0C2, this.A02);
                return new C44755Jrc(A0C2);
            }
        }
        Integer num = this.A05;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 2) {
                if (intValue != 4) {
                    i2 = R.layout.effect_mini_gallery_effect_preview_holder_no_image_with_title_and_reels_count;
                    if (intValue != 5) {
                        i2 = R.layout.effect_mini_gallery_effect_preview_holder_no_image;
                    }
                } else {
                    i2 = R.layout.effect_mini_gallery_effect_preview_holder_no_image_with_title;
                }
            } else {
                i2 = R.layout.effect_mini_gallery_effect_preview_holder_with_title;
            }
        } else {
            i2 = R.layout.effect_mini_gallery_effect_preview_view_holder;
        }
        View A0C3 = AbstractC31173DnH.A0C(from, viewGroup, i2, false);
        AbstractC13880nE.A0W(A0C3, this.A02);
        C44765Jrm c44765Jrm = new C44765Jrm(A0C3, this.A0B, num);
        c44765Jrm.A00 = this.A09;
        return c44765Jrm;
    }

    public static final void A00(Jo1 jo1) {
        int i = jo1.A00;
        for (int i2 = 0; i2 < i; i2++) {
            List list = jo1.A06;
            LHy lHy = LHy.A02;
            C14360o3.A08(lHy);
            list.add(lHy);
        }
    }

    public static final void A01(Jo1 jo1, String str, boolean z) {
        int A02;
        if (str == null) {
            A02 = jo1.A06.indexOf(LHy.A04);
        } else {
            A02 = jo1.A02(str);
            if (A02 < 0) {
                return;
            }
            C46520KiJ c46520KiJ = ((LHy) jo1.A06.get(A02)).A00;
            if (c46520KiJ != null) {
                c46520KiJ.A0B = z;
            }
        }
        jo1.notifyItemChanged(A02);
    }

    public final int A02(String str) {
        String str2;
        List list = this.A06;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C46520KiJ c46520KiJ = ((LHy) list.get(i)).A00;
            if (c46520KiJ != null) {
                str2 = c46520KiJ.A05;
            } else {
                str2 = null;
            }
            if (C14360o3.A0K(str2, str)) {
                return i;
            }
        }
        return -1;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-443505005);
        int size = this.A06.size();
        C0f9.A0A(-1970945486, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-1664542530);
        int i2 = ((LHy) this.A06.get(i)).A01;
        C0f9.A0A(-1931136486, A03);
        return i2;
    }
}
