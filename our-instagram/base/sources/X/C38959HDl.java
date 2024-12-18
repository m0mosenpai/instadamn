package X;

import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import java.util.List;

/* renamed from: X.HDl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38959HDl extends C124275jh {
    public C51737MtK A00;
    public C50627MWo A01;
    public C50679MYx A02;
    public C45116Jxl A03;
    public C84053op A04;
    public IGL A05;
    public C38959HDl A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;

    public final InterfaceC88553xD A01() {
        IGL igl = this.A05;
        InterfaceC88553xD interfaceC88553xD = null;
        if (igl != null) {
            MusicInfoImpl musicInfoImpl = igl.A00;
            if (musicInfoImpl != null) {
                interfaceC88553xD = new C88543xC(musicInfoImpl);
            } else {
                OriginalSoundData originalSoundData = igl.A01;
                if (originalSoundData != null) {
                    interfaceC88553xD = new C117235Si(originalSoundData);
                }
            }
        }
        return interfaceC88553xD;
    }

    @Override // X.AbstractC124285ji, X.InterfaceC55612h1
    public final void EQi(long j) {
        ((AbstractC124285ji) this).A00 = j;
        C38959HDl c38959HDl = this.A06;
        if (c38959HDl != null) {
            c38959HDl.EQi(j);
        }
    }

    public C38959HDl() {
        C16930sl c16930sl = C16930sl.A00;
        this.A0B = c16930sl;
        this.A0C = c16930sl;
        this.A0A = c16930sl;
    }

    public final void A02() {
        super.A00();
    }
}
