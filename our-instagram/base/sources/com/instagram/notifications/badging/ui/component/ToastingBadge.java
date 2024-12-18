package com.instagram.notifications.badging.ui.component;

import X.AbstractC06930Yk;
import X.AbstractC09440dt;
import X.AbstractC55922hc;
import X.AbstractC58112lT;
import X.C00O;
import X.C09530e4;
import X.C14360o3;
import X.C206919Dw;
import X.C54682fQ;
import X.EnumC54222eY;
import X.EnumC58162lY;
import X.InterfaceC09390do;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ToastingBadge extends AbstractC58112lT {
    public EnumC54222eY A00;
    public final EnumC58162lY A01;
    public final boolean A02;
    public final TypedArray A03;
    public final Map A04;
    public final InterfaceC09390do A05;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public final void setUseCase(EnumC54222eY enumC54222eY) {
        C14360o3.A0B(enumC54222eY, 0);
        this.A00 = enumC54222eY;
    }

    public final EnumC54222eY getUseCase() {
        EnumC54222eY enumC54222eY = this.A00;
        if (enumC54222eY != null) {
            return enumC54222eY;
        }
        C14360o3.A0F("useCase");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4(0, EnumC58162lY.A06), new C09530e4(1, EnumC58162lY.A0E), new C09530e4(2, EnumC58162lY.A0D), new C09530e4(3, EnumC58162lY.A03), new C09530e4(4, EnumC58162lY.A04), new C09530e4(5, EnumC58162lY.A0F));
        this.A04 = A06;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC55922hc.A2K, 0, 0);
        C14360o3.A07(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes;
        this.A02 = obtainStyledAttributes.getBoolean(2, false);
        EnumC58162lY enumC58162lY = (EnumC58162lY) A06.get(Integer.valueOf(obtainStyledAttributes.getInt(0, -1)));
        this.A01 = enumC58162lY == null ? EnumC58162lY.A0B : enumC58162lY;
        this.A05 = AbstractC09440dt.A01(new C206919Dw(this, 16));
    }

    @Override // X.AbstractC58112lT
    public C54682fQ getViewModelFactory() {
        return (C54682fQ) this.A05.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToastingBadge(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ ToastingBadge(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
