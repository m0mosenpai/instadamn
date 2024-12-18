package X;

import android.os.Bundle;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.download.CreditCardModulesDownloader;
import com.facebook.smartcapture.experimentation.IdCaptureExperimentConfigProvider;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;
import com.facebook.smartcapture.resources.ResourcesProvider;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import com.facebook.smartcapture.ui.IdCaptureUi;
import java.util.HashSet;

/* loaded from: classes10.dex */
public final class SXL {
    public int A00;
    public long A01;
    public Bundle A02;
    public FixedSizes A03;
    public EnumC61111RfR A04;
    public EnumC61146Rg7 A05;
    public CreditCardModulesDownloader A06;
    public IdCaptureExperimentConfigProvider A07;
    public SmartCaptureLoggerProvider A08;
    public ResourcesProvider A09;
    public StringOverrideFactory A0A;
    public IdCaptureUi A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0H;
    public String A0I;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public java.util.Set A0J = AbstractC166987dD.A1H();
    public String A0G = "";

    public static void A00(SXL sxl, String str) {
        if (!sxl.A0J.contains(str)) {
            HashSet A0k = AbstractC31171DnF.A0k(sxl.A0J);
            sxl.A0J = A0k;
            A0k.add(str);
        }
    }
}
