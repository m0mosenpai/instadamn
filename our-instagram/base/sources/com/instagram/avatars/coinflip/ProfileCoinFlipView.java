package com.instagram.avatars.coinflip;

import X.AbstractC001800i;
import X.AbstractC1569172v;
import X.C14360o3;
import X.C16930sl;
import X.C74P;
import X.C9EI;
import X.EnumC152426tV;
import X.InterfaceC11380iw;
import X.InterfaceC73023Pd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ProfileCoinFlipView extends AbstractC1569172v {
    public float A00;
    public EnumC152426tV A01;
    public List A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileCoinFlipView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A0F(EnumC152426tV enumC152426tV) {
        if (this.A01 != enumC152426tV) {
            this.A01 = enumC152426tV;
            int ordinal = enumC152426tV.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    if (!this.A02.isEmpty()) {
                        C74P c74p = (C74P) AbstractC001800i.A0O(this.A02, 0);
                        if (c74p != null && !c74p.A0L) {
                            c74p.A0L = true;
                            c74p.invalidateSelf();
                        }
                        setAvatarImageDrawable((Drawable) AbstractC001800i.A0O(this.A02, 0));
                        return;
                    }
                    return;
                }
                throw new RuntimeException();
            }
            A0E();
            ((AbstractC1569172v) this).A03.setVisibility(0);
            ((AbstractC1569172v) this).A02.setVisibility(4);
            ((AbstractC1569172v) this).A01.setVisibility(4);
        }
    }

    public final void setAvatarDrawables(List list) {
        C14360o3.A0B(list, 0);
        this.A02 = list;
    }

    @Override // X.AbstractC1569172v
    public void setProfilePicUrl(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(imageUrl, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        ((AbstractC1569172v) this).A03.A0E = new InterfaceC73023Pd() { // from class: X.74h
            @Override // X.InterfaceC73023Pd
            public final void DFp() {
                for (C74O c74o : ProfileCoinFlipView.this.A02) {
                    if (c74o != null) {
                        C74O.A00(c74o, c74o.A0l);
                    }
                }
            }

            @Override // X.InterfaceC73023Pd
            public final void DPX(C73083Pj c73083Pj) {
                for (C74O c74o : ProfileCoinFlipView.this.A02) {
                    if (c74o != null) {
                        C74O.A00(c74o, c74o.A0l);
                    }
                }
            }
        };
        super.setProfilePicUrl(imageUrl, interfaceC11380iw);
    }

    public static final void A00(ProfileCoinFlipView profileCoinFlipView) {
        C74P c74p;
        if (profileCoinFlipView.A02.size() > 1 && (c74p = (C74P) AbstractC001800i.A0O(profileCoinFlipView.A02, 1)) != null) {
            c74p.A06();
            profileCoinFlipView.setAvatarImageDrawable(c74p);
        }
    }

    public final void A0D() {
        C74P c74p = (C74P) AbstractC001800i.A0O(this.A02, 0);
        if (c74p != null) {
            A0E();
            c74p.A0I = new C9EI(this, 25);
            c74p.A0A(1);
            c74p.A08();
        }
    }

    public final void A0E() {
        C74P c74p;
        if ((!this.A02.isEmpty()) && (c74p = (C74P) AbstractC001800i.A0O(this.A02, 0)) != null) {
            c74p.A06();
        }
    }

    public final List getAvatarDrawables() {
        return this.A02;
    }

    public final EnumC152426tV getCurrentSide() {
        return this.A01;
    }

    public final float getInitialScale() {
        return this.A00;
    }

    public final void setInitialScale(float f) {
        this.A00 = f;
    }

    public /* synthetic */ ProfileCoinFlipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCoinFlipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        setWillNotDraw(false);
        View.inflate(context, R.layout.coin_flip_layout, this);
        ((AbstractC1569172v) this).A03 = (IgImageView) findViewById(R.id.profilePic);
        ((AbstractC1569172v) this).A01 = (CoinFlipAvatarImageView) findViewById(R.id.avatar);
        ((AbstractC1569172v) this).A02 = (IgImageView) findViewById(R.id.circle_background);
        ((AbstractC1569172v) this).A00 = (ConstraintLayout) findViewById(R.id.coin_flip_layout);
        ((AbstractC1569172v) this).A04 = "";
        this.A00 = 1.0f;
        this.A02 = C16930sl.A00;
        this.A01 = EnumC152426tV.A03;
    }
}
