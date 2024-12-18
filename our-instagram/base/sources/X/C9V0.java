package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.util.Map;

/* renamed from: X.9V0, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9V0 extends C3OO {
    public Bitmap A00;
    public C9V0 A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Drawable A07;
    public final C55982hj A08;
    public final C55982hj A09;
    public final RoundedCornerImageView A0A;
    public final InterfaceC56392iX A0B;
    public final InterfaceC187328Rz A0C;
    public final C8SB A0D;

    public C9V0(View view, C8SB c8sb, InterfaceC187328Rz interfaceC187328Rz) {
        super(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.thumbnail_image);
        this.A0A = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C3OB.A02);
        View findViewById = view.findViewById(R.id.duplicate_thumbnail_stub);
        this.A0B = AbstractC56372iV.A00(findViewById == null ? view.findViewById(R.id.thumbnail_image) : findViewById);
        Context context = view.getContext();
        Drawable drawable = context.getDrawable(R.drawable.item_placeholder);
        if (drawable != null) {
            this.A07 = drawable;
            C55982hj A0R = AbstractC167007dF.A0R();
            A0R.A06 = true;
            this.A08 = A0R;
            final int A06 = AbstractC166997dE.A06(view.getResources());
            A0R.A0A(new C668630d() { // from class: X.9e0
                @Override // X.C668630d, X.InterfaceC55932he
                public final void Dnm(C55982hj c55982hj) {
                    C14360o3.A0B(c55982hj, 0);
                    View view2 = C9V0.this.A0B.getView();
                    C55992hk c55992hk = c55982hj.A09;
                    view2.setRotation(((float) c55992hk.A00) * 10.0f);
                    view2.setTranslationX(((float) c55992hk.A00) * A06);
                    view2.setAlpha((float) c55992hk.A00);
                }
            });
            C55982hj A0R2 = AbstractC167007dF.A0R();
            A0R2.A06 = true;
            A0R2.A08(1.2000000476837158d, true);
            this.A09 = A0R2;
            A0R2.A0A(new C214039e2(view, 3));
            this.A0C = interfaceC187328Rz;
            this.A0D = c8sb;
            if (c8sb != null) {
                roundedCornerImageView.setOnTouchListener(new ViewOnTouchListenerC209789Po(new GestureDetector(context, new C9TH(0, interfaceC187328Rz, this)), 6));
                AbstractC010103p.A0B(roundedCornerImageView, new UEF(1));
                return;
            }
            C3P9 A0s = AbstractC166987dD.A0s(roundedCornerImageView);
            A0s.A0D = true;
            A0s.A07 = true;
            A0s.A02 = 0.95f;
            A0s.A04 = new C23686AeL(interfaceC187328Rz, this);
            A0s.A00();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A00(Bitmap bitmap, InterfaceC11380iw interfaceC11380iw, Object obj, boolean z) {
        Resources resources;
        int i;
        this.A02 = obj;
        this.A00 = bitmap;
        this.itemView.setVisibility(0);
        if (this.A0D == null) {
            RoundedCornerImageView roundedCornerImageView = this.A0A;
            roundedCornerImageView.setImageDrawable(this.A07);
            roundedCornerImageView.setScaleX(1.0f);
            roundedCornerImageView.setScaleY(1.0f);
        }
        this.A06 = z;
        RoundedCornerImageView roundedCornerImageView2 = this.A0A;
        roundedCornerImageView2.setStrokeEnabled(z);
        if (bitmap == null) {
            if (this instanceof C219869nY) {
                C219869nY c219869nY = (C219869nY) this;
                Medium medium = (Medium) obj;
                C14360o3.A0B(medium, 0);
                c219869nY.A01 = medium;
                RoundedCornerImageView roundedCornerImageView3 = c219869nY.A0A;
                roundedCornerImageView3.A01 = medium.A07;
                Resources resources2 = roundedCornerImageView3.getResources();
                int i2 = 2131969597;
                if (medium.Cff()) {
                    i2 = 2131976737;
                }
                roundedCornerImageView3.setContentDescription(resources2.getString(i2));
                c219869nY.A00 = c219869nY.A02.AGR(null, c219869nY.A00, medium, c219869nY, null, null, null);
                return;
            }
            if (this instanceof C219849nW) {
                C219849nW c219849nW = (C219849nW) this;
                C183978Ee c183978Ee = (C183978Ee) obj;
                C14360o3.A0B(c183978Ee, 0);
                int i3 = c183978Ee.A09;
                int i4 = c183978Ee.A06;
                int i5 = 1;
                while (i3 / i5 > c219849nW.A01 && i4 / i5 > c219849nW.A00) {
                    i5 *= 2;
                }
                SimpleImageUrl A01 = AbstractC81033jX.A01(c183978Ee.A03());
                roundedCornerImageView2 = c219849nW.A0A;
                roundedCornerImageView2.A01 = c183978Ee.A07;
                roundedCornerImageView2.A05 = c183978Ee.A14;
                roundedCornerImageView2.A0E(interfaceC11380iw, A01, i5);
                resources = roundedCornerImageView2.getResources();
                i = 2131969597;
            } else if (this instanceof C219859nX) {
                C219859nX c219859nX = (C219859nX) this;
                C195868lW c195868lW = (C195868lW) obj;
                C14360o3.A0B(c195868lW, 0);
                c219859nX.A00 = c195868lW;
                C8SH c8sh = c219859nX.A01;
                String A07 = c195868lW.A07();
                c8sh.A06.put(A07, c219859nX);
                Map map = c8sh.A04;
                if (map.containsKey(A07)) {
                    C1OG A0J = C25821No.A00().A0J((ImageUrl) map.get(A07), null);
                    A0J.A08 = c195868lW;
                    A0J.A02(c8sh);
                    A0J.A01();
                } else {
                    java.util.Set set = c8sh.A05;
                    if (!set.contains(A07)) {
                        C121275eQ c121275eQ = new C121275eQ(new B1S(c8sh.A02, c8sh.A03, c219859nX, c195868lW, c8sh), 484);
                        c121275eQ.A00 = new C215959hB(c8sh, c195868lW, A07, 1);
                        set.add(A07);
                        C1GJ.A03(c121275eQ);
                    }
                }
                roundedCornerImageView2 = c219859nX.A0A;
                resources = roundedCornerImageView2.getResources();
                i = 2131976737;
            } else {
                ImageUrl imageUrl = (ImageUrl) obj;
                C14360o3.A0B(imageUrl, 0);
                roundedCornerImageView2.setUrl(imageUrl, interfaceC11380iw);
                resources = roundedCornerImageView2.getResources();
                i = 2131966152;
            }
            roundedCornerImageView2.setContentDescription(resources.getString(i));
            return;
        }
        roundedCornerImageView2.setImageBitmap(bitmap);
    }

    public final void A01(boolean z) {
        AbstractC125325le A01;
        float f;
        this.A03 = z;
        if (z) {
            C2UY.A01.A05(20L);
            A01 = AbstractC125325le.A01(this.itemView, 1);
            C14360o3.A07(A01);
            A01.A0I(0.7f);
            A01.A0P(1.2f, -1.0f);
            A01.A0Q(1.2f, -1.0f);
            C14360o3.A0C(this.A0A.getParent(), AbstractC111324zv.A00(2));
            f = (-((View) r3).getHeight()) * 0.3333f;
        } else {
            A01 = AbstractC125325le.A01(this.itemView, 1);
            C14360o3.A07(A01);
            A01.A0I(1.0f);
            A01.A0P(1.0f, -1.0f);
            A01.A0Q(1.0f, -1.0f);
            f = 0.0f;
        }
        A01.A0K(f);
        A01.A0C(200L).A0H();
    }
}
