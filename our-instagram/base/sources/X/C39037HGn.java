package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;

/* renamed from: X.HGn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39037HGn extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        view.setOnClickListener(null);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        int intValue;
        ImageInfo A1t;
        ExtendedImageUrl A01;
        JM4 Bh5;
        ProductImageContainer Bcl;
        C40933IBg c40933IBg = (C40933IBg) AnonymousClass634.A06(c6fg, c102884kP);
        if (c40933IBg != null) {
            C132825z5 c132825z5 = c40933IBg.A00.A00;
            FragmentActivity A03 = C6BQ.A03(c6fg);
            AbstractC12990ll A0A = C6BQ.A0A(c6fg);
            InterfaceC11380iw A07 = C6BQ.A07(c6fg);
            Context context = c6fg.A00;
            View findViewById = view.findViewById(R.id.cover_photo_container);
            if (findViewById != null) {
                C44376JjF c44376JjF = new C44376JjF(context, 0.25f, 0.5f, 0.0f, 0.2f, 0.6f, context.getColor(R.color.fds_transparent), 0, context.getColor(AbstractC53242c7.A04(context)), 300L, false, false, false, false);
                findViewById.setBackground(c44376JjF);
                H7P h7p = c132825z5.A00;
                if (h7p != null) {
                    int ordinal = h7p.A00.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 0) {
                                throw B4Z.A00();
                            }
                        } else {
                            H7O h7o = h7p.A01;
                            if (h7o != null && (Bh5 = h7o.Bh5()) != null && (Bcl = Bh5.Bcl()) != null) {
                                A1t = Bcl.BGx();
                            }
                        }
                    } else {
                        C38321qM BG1 = h7p.A01.BG1();
                        if (BG1 != null) {
                            A1t = BG1.A1t();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    if (A1t != null && (A01 = AbstractC40161tk.A01(context, A1t)) != null) {
                        c44376JjF.A02(A01, null);
                    }
                }
                C0fQ.A00(new ViewOnClickListenerC41994IjP(0, this, A07, A0A, A03, c132825z5), findViewById);
            } else {
                AbstractC25241Le.A02("IgGuideBinderUtils", "No cover photo");
            }
            TextView A0e = AbstractC166987dD.A0e(view, R.id.detail_text);
            if (A0e != null) {
                C14360o3.A0B(c132825z5, 1);
                EnumC39565Hdb enumC39565Hdb = c132825z5.A02;
                Integer num = c132825z5.A04;
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                A0e.setText(I1G.A00(context, enumC39565Hdb, intValue));
            } else {
                AbstractC25241Le.A02("IgGuideBinderUtils", "No detail text");
            }
            TextView A0e2 = AbstractC166987dD.A0e(view, R.id.title_text);
            if (A0e2 != null) {
                A0e2.setText(c132825z5.A08);
            } else {
                AbstractC25241Le.A02("IgGuideBinderUtils", "No title text");
            }
            IgImageView igImageView = (IgImageView) view.findViewById(R.id.owner_image);
            if (igImageView != null) {
                AbstractC31173DnH.A1T(A07, igImageView, c132825z5.A03);
            } else {
                AbstractC25241Le.A02("IgGuideBinderUtils", "No owner image");
            }
            TextView A0e3 = AbstractC166987dD.A0e(view, R.id.owner_text);
            if (A0e3 != null) {
                AbstractC31173DnH.A1F(A0e3, c132825z5.A03);
                C85963sQ.A09(A0e3, 0, AbstractC167017dG.A04(context), context.getColor(AbstractC53242c7.A05(context)), c132825z5.A03.isVerified());
                return null;
            }
            AbstractC25241Le.A02("IgGuideBinderUtils", "No owner text");
            return null;
        }
        throw new RuntimeException("No controller found");
    }

    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        return AbstractC31172DnG.A0A(LayoutInflater.from(context), null, R.layout.guide_card);
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }

    public C39037HGn(C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
    }
}
