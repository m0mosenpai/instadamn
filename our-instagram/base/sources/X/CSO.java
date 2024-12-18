package X;

import com.instagram.api.schemas.ClipsTrialDict;
import com.instagram.api.schemas.MediaTrialGraduationStrategy;
import com.instagram.api.schemas.MediaTrialStatus;

/* loaded from: classes5.dex */
public class CSO {
    public MediaTrialGraduationStrategy A00;
    public MediaTrialStatus A01;
    public Boolean A02;
    public Boolean A03;
    public final ClipsTrialDict A04;

    public CSO(ClipsTrialDict clipsTrialDict) {
        this.A04 = clipsTrialDict;
        this.A02 = clipsTrialDict.Al7();
        this.A00 = clipsTrialDict.BAG();
        this.A03 = clipsTrialDict.Cc9();
        this.A01 = clipsTrialDict.C0I();
    }
}
