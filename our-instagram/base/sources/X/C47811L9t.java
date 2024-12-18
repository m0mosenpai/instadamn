package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.L9t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47811L9t {
    public final MR0 A00;
    public final C49519LuY A01;
    public final String A02;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass841 A05;
    public final C48640LfI A06;
    public final C47Z A07;

    public final void A01(EnumC46263Kdv enumC46263Kdv, JIN jin) {
        MR0 mr0 = this.A00;
        C49519LuY c49519LuY = this.A01;
        mr0.Ekn(c49519LuY, true);
        c49519LuY.A03(jin);
        c49519LuY.A00 = enumC46263Kdv;
        c49519LuY.A07.A0G = enumC46263Kdv;
    }

    public C47811L9t(Activity activity, Context context, ImageView imageView, AbstractC59962oe abstractC59962oe, UserSession userSession, AnonymousClass841 anonymousClass841, MR0 mr0, C47Z c47z, InterfaceC189598ae interfaceC189598ae, int i, boolean z) {
        AbstractC167017dG.A1P(userSession, context);
        C14360o3.A0B(c47z, 5);
        this.A04 = userSession;
        this.A03 = context;
        this.A07 = c47z;
        this.A00 = mr0;
        this.A05 = anonymousClass841;
        String str = AbstractC50666MYj.A00(userSession).A02;
        str = str == null ? "" : str;
        this.A02 = str;
        this.A01 = new C49519LuY(context, imageView, abstractC59962oe, userSession, anonymousClass841, c47z, interfaceC189598ae, str, new C57744PjX(this, 33), i);
        this.A06 = new C48640LfI(activity, context, userSession, anonymousClass841, new C48629Lf5(this), new LfE(this), c47z, new C57242PbQ(this, 28), z);
    }

    public final void A00(ImageView imageView) {
        ImageUrl imageUrl;
        Drawable A00;
        C49519LuY c49519LuY = this.A01;
        MusicOverlayStickerModel musicOverlayStickerModel = c49519LuY.A08.A1J;
        if (musicOverlayStickerModel != null) {
            imageUrl = musicOverlayStickerModel.A03;
        } else {
            imageUrl = null;
        }
        Context context = c49519LuY.A05;
        if (imageUrl == null) {
            A00 = context.getDrawable(c49519LuY.A04);
            if (A00 == null) {
                throw AbstractC166997dE.A0g();
            }
        } else {
            A00 = AbstractC47072KrT.A00(context, imageUrl);
        }
        imageView.setImageDrawable(A00);
        Context context2 = this.A03;
        AbstractC166997dE.A18(context2, imageView, 2131967916);
        AbstractC56832jG.A00(imageView, context2.getColor(AbstractC53242c7.A08(context2)), AbstractC167007dF.A09(context2, R.attr.igds_color_creation_tools_blue), 255);
        ViewOnClickListenerC48063LPo.A00(imageView, 46, this);
    }

    public final void A02(EnumC46263Kdv enumC46263Kdv, Integer num) {
        if (C36A.A0K(this.A04, AbstractC167007dF.A1X(this.A07.A1G, EnumC40111tc.A09), this.A05.CMB())) {
            this.A00.E3n();
        }
        this.A00.DUF();
        this.A06.Eo2(enumC46263Kdv, null, null, num, null, null);
    }
}
