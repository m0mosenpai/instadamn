package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

/* renamed from: X.MRv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC50518MRv {
    List Aa2();

    C81613kW Aic();

    Integer An0();

    boolean Aqm();

    ImageUrl Ass();

    String Asv();

    @Deprecated(message = "Use UnifiedThreadKey instead to support MSYS threads", replaceWith = @ReplaceWith(expression = "getUnifiedThreadKey()", imports = {}))
    DirectThreadKey Axg();

    List Axh();

    String B5E();

    int BI1();

    AnonymousClass172 BJU();

    List BKM();

    List BKN();

    long BLG();

    String BLZ();

    Long BLu();

    Integer BN6();

    int BT2();

    Map BX8();

    C9BO BXU();

    int BY6();

    List BbX();

    long BdM();

    List Bl3();

    List Bl6();

    C51593Mql C58();

    int C7C();

    ImageUrl C7H();

    DirectShareTarget C7e();

    int C7g();

    String C7l();

    EnumC92794Ds CAo();

    C3o9 CCb();

    User CDm(String str, String str2);

    LinkedHashMap CDv();

    boolean CKe();

    boolean CKg();

    boolean CLG();

    boolean CM0();

    boolean CM1();

    boolean CM2();

    boolean CM3();

    boolean CM4();

    boolean CNV();

    boolean CNW();

    boolean CPo();

    boolean CSH();

    boolean CSp();

    boolean CTV();

    boolean CUM();

    boolean CUy();

    boolean CVQ();

    boolean CVU();

    boolean CVl();

    boolean CWD();

    boolean CWO();

    boolean CX1();

    boolean CXG();

    boolean CXl();

    boolean CXo();

    boolean CXz();

    boolean CYQ();

    boolean CZH();

    boolean CaK();

    boolean CaO();

    boolean CbK();

    boolean CbX();

    boolean CbY();

    boolean CdS();

    boolean Cdw();

    boolean CeR();

    boolean CeS();

    boolean Cf6();

    boolean CfB();

    boolean CfO();

    boolean Cfg();

    boolean Cfh();

    boolean Cfy();

    boolean EjY();

    boolean Eje();

    boolean isMuted();

    boolean isPending();

    static boolean A00(InterfaceC50518MRv interfaceC50518MRv) {
        return AbstractC31224Do7.A03(interfaceC50518MRv.Bl6(), interfaceC50518MRv.CVQ());
    }
}
