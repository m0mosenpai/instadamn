package com.instagram.user.follow;

import X.AbstractC166997dE;
import X.AbstractC31177DnL;
import X.C00O;
import X.C14360o3;
import X.C65741TtG;
import X.C67893V1b;
import X.C67916V2g;
import X.JQ0;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.model.User;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class BlockButton extends UpdatableButton {
    public boolean A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
    }

    public static final void A00(C67893V1b c67893V1b, BlockButton blockButton, User user) {
        Editable text;
        boolean z = !blockButton.A00;
        blockButton.A00 = z;
        blockButton.setIsBlueButton(!z);
        blockButton.refreshDrawableState();
        C67916V2g c67916V2g = c67893V1b.A00;
        if (c67916V2g == null) {
            C14360o3.A0F("adapter");
            throw C00O.createAndThrow();
        }
        C65741TtG c65741TtG = new C65741TtG(user);
        Set set = c67916V2g.A0B;
        if (set.contains(c65741TtG)) {
            Set set2 = c67916V2g.A0C;
            if (set2.contains(c65741TtG)) {
                set2.remove(c65741TtG);
            } else {
                c67916V2g.A0D.add(c65741TtG);
            }
            set.remove(c65741TtG);
            c67916V2g.A0E.add(c65741TtG);
        } else {
            Set set3 = c67916V2g.A0D;
            if (set3.contains(c65741TtG)) {
                set3.remove(c65741TtG);
            } else {
                c67916V2g.A0C.add(c65741TtG);
            }
            c67916V2g.A0E.remove(c65741TtG);
            set.add(c65741TtG);
        }
        SearchEditText searchEditText = c67893V1b.A02;
        if (searchEditText != null && (text = searchEditText.getText()) != null && text.length() != 0) {
            SearchEditText searchEditText2 = c67893V1b.A02;
            if (searchEditText2 != null) {
                searchEditText2.setText("");
            }
            SearchEditText searchEditText3 = c67893V1b.A02;
            if (searchEditText3 != null) {
                searchEditText3.clearFocus();
            }
            SearchEditText searchEditText4 = c67893V1b.A02;
            if (searchEditText4 != null) {
                searchEditText4.A04();
            }
        }
    }

    public static final void A02(BlockButton blockButton, User user) {
        int i = 2131953938;
        if (blockButton.A00) {
            i = 2131953942;
        }
        blockButton.setText(i);
        Context A0L = AbstractC166997dE.A0L(blockButton);
        boolean z = blockButton.A00;
        String B8y = user.B8y();
        int i2 = 2131953940;
        if (z) {
            i2 = 2131953943;
        }
        blockButton.setContentDescription(AbstractC31177DnL.A0b(A0L, B8y, i2));
        blockButton.setEnabled(true);
    }

    public /* synthetic */ BlockButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }
}
