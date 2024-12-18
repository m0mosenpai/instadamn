package X;

import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import java.util.List;

/* renamed from: X.Ahn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23894Ahn implements BC2 {
    public final ClipsTemplateModel A00;
    public final C203248yh A01;
    public final List A02;
    public final List A03;
    public final List A04;

    @Override // X.BC2
    public final Object Cq7(C128175qm c128175qm, InterfaceC23621Ds interfaceC23621Ds) {
        MXY mxy = new MXY();
        mxy.A0i = new MXZ(this.A01);
        mxy.A0n = new MXZ(this.A04);
        mxy.A01 = new MXZ(this.A02);
        mxy.A0l = new MXZ(this.A03);
        mxy.A04(this.A00);
        return mxy.A01(c128175qm);
    }

    public C23894Ahn(ClipsTemplateModel clipsTemplateModel, C203248yh c203248yh, List list, List list2, List list3) {
        this.A01 = c203248yh;
        this.A04 = list;
        this.A02 = list2;
        this.A03 = list3;
        this.A00 = clipsTemplateModel;
    }
}
