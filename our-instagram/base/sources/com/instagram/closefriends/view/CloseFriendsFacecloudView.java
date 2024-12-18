package com.instagram.closefriends.view;

import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.C05F;
import X.C14360o3;
import X.C55982hj;
import X.InterfaceC55932he;
import X.JQ0;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.tigon.tigonhuc.HucClient;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CloseFriendsFacecloudView extends FrameLayout implements InterfaceC55932he {
    public static final List A03 = AbstractC16960so.A1Q(Integer.valueOf(HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), 20, 240, Integer.valueOf(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD), 180, 60, 330, 210, 45, 255);
    public static final List A04 = AbstractC16960so.A1Q(110, 110, 130, 110, 130, 130, 90, 90, 90, 90);
    public static final List A05 = AbstractC16960so.A1Q(62, 52, 36, 36, 36, 62, 36, 36, 36, 36);
    public Integer A00;
    public final C55982hj A01;
    public final List A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseFriendsFacecloudView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (this.A00 == C05F.A01) {
            this.A00 = C05F.A0C;
            AbstractC13880nE.A00(AbstractC166997dE.A0L(this), 3.0f);
            Iterator it = this.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("isAnimated");
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (this.A00 == C05F.A01) {
            getWidth();
            getHeight();
            Iterator it = this.A02.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("isAnimated");
            }
        }
    }

    public /* synthetic */ CloseFriendsFacecloudView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseFriendsFacecloudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A02 = AbstractC166987dD.A1E();
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A04();
        A0R.A01();
        A0R.A0A(this);
        this.A01 = A0R;
        this.A00 = C05F.A00;
    }
}
