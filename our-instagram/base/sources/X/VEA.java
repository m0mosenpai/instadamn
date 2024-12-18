package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class VEA {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ VEA[] A02;
    public static final VEA A03;
    public static final VEA A04;
    public static final VEA A05;
    public static final VEA A06;
    public static final VEA A07;
    public static final VEA A08;
    public static final VEA A09;
    public static final VEA A0A;
    public static final VEA A0B;
    public static final VEA A0C;
    public static final VEA A0D;
    public static final VEA A0E;
    public static final VEA A0F;
    public static final VEA A0G;
    public final String A00;

    static {
        VEA vea = new VEA("PARAMS", 0, "params");
        A0D = vea;
        VEA vea2 = new VEA("SERVER_PARAMS", 1, "server_params");
        A0F = vea2;
        VEA vea3 = new VEA("ENTRY_POINT", 2, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        A09 = vea3;
        VEA vea4 = new VEA("FLOW", 3, "flow");
        A0B = vea4;
        VEA vea5 = new VEA("FLOW_ID", 4, "flow_id");
        A0C = vea5;
        VEA vea6 = new VEA("STEPPER_COUNT", 5, "stepper_count");
        A0G = vea6;
        VEA vea7 = new VEA("BRIDGE_TO_PROMOTE_CALLSITE", 6, "bridge_to_promote_callsite");
        A07 = vea7;
        VEA vea8 = new VEA("PROMOTE_PREVALIDATION_EXCEPTION", 7, "promote_prevalidation_exception");
        A0E = vea8;
        VEA vea9 = new VEA("AUTH_DATA", 8, "auth_data");
        A05 = vea9;
        VEA vea10 = new VEA("ACCOUNT_TYPE", 9, "account_type");
        A04 = vea10;
        VEA vea11 = new VEA("ACCESS_TOKEN", 10, "access_token");
        A03 = vea11;
        VEA vea12 = new VEA("DATA_SOURCE", 11, CacheBehaviorLogger.SOURCE);
        A08 = vea12;
        VEA vea13 = new VEA("BOOST_IN_APP_QPL_INSTANCE_ID", 12, "boost_in_app_qpl_instance_id");
        A06 = vea13;
        VEA vea14 = new VEA("EXTRA_DATA", 13, "extra_data");
        A0A = vea14;
        VEA[] veaArr = {vea, vea2, vea3, vea4, vea5, vea6, vea7, vea8, vea9, vea10, vea11, vea12, vea13, vea14, new VEA("SELECTED_AUDIO_SPEC", 14, "selected_audio_spec")};
        A02 = veaArr;
        A01 = AbstractC12190kN.A00(veaArr);
    }

    public static VEA valueOf(String str) {
        return (VEA) Enum.valueOf(VEA.class, str);
    }

    public static VEA[] values() {
        return (VEA[]) A02.clone();
    }

    public VEA(String str, int i, String str2) {
        this.A00 = str2;
    }
}
