package com.instagram.hashtag.ui;

import X.AbstractC1120253r;
import X.AbstractC20100yh;
import X.C14360o3;
import X.C20150ym;
import X.GZ9;
import X.InterfaceC11380iw;
import X.ViewOnClickListenerC35613Fo4;
import X.XAs;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.textview.UpdatableButton;

/* loaded from: classes3.dex */
public class HashtagFollowButton extends UpdatableButton {
    public XAs A00;
    public String A01;

    public HashtagFollowButton(Context context) {
        this(context, null);
    }

    public final void A01(InterfaceC11380iw interfaceC11380iw, GZ9 gz9, Hashtag hashtag) {
        C14360o3.A0B(hashtag, 0);
        boolean A03 = AbstractC1120253r.A03(hashtag);
        XAs xAs = this.A00;
        if (xAs != null) {
            xAs.DKE(hashtag);
        }
        if (C20150ym.A07(AbstractC20100yh.A00(36329938650939981L))) {
            A00(this, "", A03);
            return;
        }
        if (hashtag.getName() != null) {
            A00(this, hashtag.getName(), A03);
        }
        setOnClickListener(new ViewOnClickListenerC35613Fo4(interfaceC11380iw, gz9, this, hashtag, A03));
    }

    public static void A00(HashtagFollowButton hashtagFollowButton, String str, boolean z) {
        int i;
        if (C20150ym.A07(AbstractC20100yh.A00(36329938650939981L))) {
            hashtagFollowButton.setVisibility(8);
            hashtagFollowButton.setIsDisabled(true);
            return;
        }
        hashtagFollowButton.setIsBlueButton(!z);
        hashtagFollowButton.refreshDrawableState();
        hashtagFollowButton.setEnabled(true);
        Resources resources = hashtagFollowButton.getContext().getResources();
        int i2 = 2131962761;
        if (z) {
            i2 = 2131962763;
        }
        hashtagFollowButton.setContentDescription(resources.getString(i2, str));
        if (!z) {
            if (!TextUtils.isEmpty(hashtagFollowButton.A01)) {
                hashtagFollowButton.setText(hashtagFollowButton.A01);
                return;
            }
            i = 2131962758;
        } else {
            i = 2131962762;
        }
        hashtagFollowButton.setText(i);
    }

    public void setCustomFollowText(String str) {
        this.A01 = str;
    }

    public void setHashtagUpdateListener(XAs xAs) {
        this.A00 = xAs;
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HashtagFollowButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
