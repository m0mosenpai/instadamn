package X;

import com.instagram.ui.widget.colourwheel.ColourWheelView;

/* renamed from: X.AnQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24141AnQ implements C8LE {
    public final /* synthetic */ AM2 A00;
    public final /* synthetic */ ColourWheelView A01;

    @Override // X.C8LE
    public final /* synthetic */ void D62() {
    }

    @Override // X.C8LE
    public final /* synthetic */ void D63() {
    }

    @Override // X.C8LE
    public final /* synthetic */ void D64() {
    }

    public C24141AnQ(AM2 am2, ColourWheelView colourWheelView) {
        this.A00 = am2;
        this.A01 = colourWheelView;
    }

    @Override // X.C8LE
    public final void D60(int i) {
        AM2 am2 = this.A00;
        C8DV c8dv = am2.A01;
        if (c8dv == null) {
            AbstractC12120kG.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null onColourPreview");
        } else {
            c8dv.A02(i);
            AM2.A01(am2, false);
        }
    }

    @Override // X.C8LE
    public final void D61(int i) {
        String id;
        AM2 am2 = this.A00;
        C8DV c8dv = am2.A01;
        if (c8dv == null) {
            AbstractC12120kG.A01("TextModeComposerGradientBackgroundController", "mTextColorSchemeList is null onColourSelected");
            return;
        }
        c8dv.A02(i);
        C23031Ai c23031Ai = am2.A0E;
        String str = am2.A03.A09;
        int i2 = am2.A01.A01;
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D(AnonymousClass001.A0R("text_to_camera_custom_text_color_scheme_index_", str), i2);
        ARD.apply();
        String str2 = am2.A03.A09;
        C14360o3.A0B(str2, 0);
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7D(AnonymousClass001.A0R("text_to_camera_custom_text_color_scheme_colour_", str2), i);
        ARD2.apply();
        am2.A00 = i;
        AM2.A01(am2, true);
        this.A01.setBaseDrawable(am2.A0B.A01());
        C22837A5g c22837A5g = am2.A0C;
        InterfaceC19610xo ARD3 = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD3.E77("has_used_create_mode_colour_wheel", true);
        ARD3.apply();
        C8LD c8ld = c22837A5g.A00;
        C22C A01 = AnonymousClass229.A01(c8ld.A0U);
        C88X A012 = c8ld.A0X.A0H.A01();
        if (A012 == null) {
            id = null;
        } else {
            id = A012.getId();
        }
        id.getClass();
        A01.A1S(EnumC50631MWs.A06, id);
    }
}
