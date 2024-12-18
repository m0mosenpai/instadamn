package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.user.model.User;

/* renamed from: X.KiJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46520KiJ {
    public int A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public Reel A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final ImageUrl A00() {
        AttributedAREffect attributedAREffect;
        ProductAREffectContainer productAREffectContainer;
        EffectThumbnailImageDict effectThumbnailImageDict;
        ImageUrl imageUrl;
        Reel reel = this.A03;
        if (reel != null && (attributedAREffect = reel.A0G) != null && (productAREffectContainer = attributedAREffect.A04) != null && (effectThumbnailImageDict = productAREffectContainer.A00.A00.A02) != null && (imageUrl = effectThumbnailImageDict.A00) != null) {
            return imageUrl;
        }
        return this.A01;
    }

    public final String A01() {
        AttributedAREffect attributedAREffect;
        ProductAREffectContainer productAREffectContainer;
        User user;
        Reel reel = this.A03;
        if (reel != null && (attributedAREffect = reel.A0G) != null && (productAREffectContainer = attributedAREffect.A04) != null && (user = productAREffectContainer.A00.A01.A0G) != null) {
            return user.getUsername();
        }
        return this.A04;
    }
}
