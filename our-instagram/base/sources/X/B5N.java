package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* loaded from: classes4.dex */
public final class B5N extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B5N(Object obj, Object obj2, Object obj3, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = z;
        this.A04 = obj3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        String str;
        String str2;
        boolean z;
        Object obj4;
        int i;
        if (this.A01 != 0) {
            obj4 = this.A04;
            obj3 = this.A03;
            z = this.A07;
            str2 = this.A06;
            str = this.A05;
            obj2 = this.A02;
            i = 1;
        } else {
            obj2 = this.A02;
            obj3 = this.A03;
            str = this.A05;
            str2 = this.A06;
            z = this.A07;
            obj4 = this.A04;
            i = 0;
        }
        return new B5N(obj2, obj3, obj4, str, str2, interfaceC23621Ds, i, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        String str;
        C5RU c5ru;
        if (this.A01 != 0) {
            C1JX c1jx = C1JX.A02;
            int i = this.A00;
            if (i != 0) {
                if (i == 1) {
                    AbstractC09560e7.A00(obj);
                } else {
                    throw AbstractC166987dD.A13();
                }
            } else {
                AbstractC09560e7.A00(obj);
                TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = (TranslatedCaptionsStickerViewBinder$Holder) this.A04;
                UserSession userSession = (UserSession) this.A03;
                if (this.A07) {
                    str = this.A06;
                } else {
                    str = this.A05;
                }
                H41 h41 = ((C84823qW) this.A02).A0J;
                this.A00 = 1;
                obj = TranslatedCaptionsStickerViewBinder$Holder.A03(h41, userSession, translatedCaptionsStickerViewBinder$Holder, str, this);
                if (obj == c1jx) {
                    return c1jx;
                }
            }
            C66646URk c66646URk = (C66646URk) obj;
            IgSimpleImageView A01 = TranslatedCaptionsStickerViewBinder$Holder.A01((TranslatedCaptionsStickerViewBinder$Holder) this.A04);
            if (c66646URk != null) {
                Drawable drawable = A01.getDrawable();
                if (drawable instanceof C5RM) {
                    drawable = ((C5RM) drawable).A0A;
                }
                if ((drawable instanceof C5RU) && (c5ru = (C5RU) drawable) != null) {
                    c5ru.A08(c66646URk);
                }
            } else {
                A01.setImageDrawable(null);
            }
        } else {
            C1JX c1jx2 = C1JX.A02;
            int i2 = this.A00;
            if (i2 != 0) {
                if (i2 != 1) {
                    AbstractC09560e7.A00(obj);
                } else {
                    AbstractC09560e7.A00(obj);
                }
            } else {
                AbstractC09560e7.A00(obj);
                Object obj2 = this.A02;
                AbstractC12990ll abstractC12990ll = (AbstractC12990ll) this.A03;
                C14360o3.A0B(obj2, 0);
                C14360o3.A0B(abstractC12990ll, 1);
                ClipsRemixOriginalMediaRepository clipsRemixOriginalMediaRepository = (ClipsRemixOriginalMediaRepository) abstractC12990ll.A01(ClipsRemixOriginalMediaRepository.class, new C57256Pbe(29, obj2, abstractC12990ll));
                String str2 = this.A05;
                String str3 = this.A06;
                this.A00 = 1;
                obj = clipsRemixOriginalMediaRepository.A00(str2, str3, this);
                if (obj == c1jx2) {
                    return c1jx2;
                }
            }
            boolean z = this.A07;
            B4F b4f = new B4F((Context) this.A02, (UserSession) this.A03, (C1828989k) this.A04, z);
            this.A00 = 2;
            if (((InterfaceC19390xP) obj).collect(b4f, this) == c1jx2) {
                return c1jx2;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((B5N) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
