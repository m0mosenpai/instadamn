package com.meta.metaai.components.voice.animation.ui.view;

import X.AbstractC25227BEk;
import X.B4Z;
import X.C14360o3;
import X.C25735BYv;
import X.C76;
import X.EnumC53181Nfd;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MetaAISpeechIndicatorView extends C25735BYv {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAISpeechIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
    }

    public final void setSpeechIndicatorState(EnumC53181Nfd enumC53181Nfd) {
        C76 c76;
        switch (AbstractC25227BEk.A05(enumC53181Nfd, 0)) {
            case 0:
                c76 = C76.A02;
                break;
            case 1:
            case 2:
                c76 = C76.A04;
                break;
            case 3:
                c76 = C76.A07;
                break;
            case 4:
                c76 = C76.A06;
                break;
            case 5:
            case 6:
                c76 = C76.A03;
                break;
            default:
                throw B4Z.A00();
        }
        setSpeechIndicatorState(c76);
    }

    public /* synthetic */ MetaAISpeechIndicatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAISpeechIndicatorView(Context context) {
        super(context, null);
        C14360o3.A0B(context, 1);
    }
}
