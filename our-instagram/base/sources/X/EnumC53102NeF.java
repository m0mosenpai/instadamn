package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.NeF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53102NeF {
    public static final EnumC53102NeF[] A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ EnumC53102NeF[] A03;
    public static final EnumC53102NeF A04;
    public static final EnumC53102NeF A05;
    public static final EnumC53102NeF A06;
    public static final EnumC53102NeF A07;
    public final int A00;

    static {
        C52446NIq c52446NIq = new C52446NIq();
        A07 = c52446NIq;
        EnumC53102NeF enumC53102NeF = new EnumC53102NeF() { // from class: X.NIn
        };
        A04 = enumC53102NeF;
        C52444NIo c52444NIo = new C52444NIo();
        A05 = c52444NIo;
        C52445NIp c52445NIp = new C52445NIp();
        A06 = c52445NIp;
        EnumC53102NeF[] enumC53102NeFArr = {c52446NIq, enumC53102NeF, c52444NIo, c52445NIp};
        A03 = enumC53102NeFArr;
        A02 = AbstractC12190kN.A00(enumC53102NeFArr);
        A01 = values();
    }

    public static EnumC53102NeF[] values() {
        return (EnumC53102NeF[]) A03.clone();
    }

    public final C3OO A00(Context context, ViewGroup viewGroup) {
        if (this instanceof C52446NIq) {
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C3OO(new View(context));
        }
        if (this instanceof C52445NIp) {
            return new C51245MkU(AbstractC25226BEj.A0R(LayoutInflater.from(context), viewGroup, R.layout.layout_cta_selector_radio_group, false));
        }
        boolean z = this instanceof C52444NIo;
        LayoutInflater from = LayoutInflater.from(context);
        if (z) {
            return new C3OO(AbstractC25226BEj.A0R(from, viewGroup, R.layout.layout_cta_selector_header_section, false));
        }
        return new C51293MlG(AbstractC25226BEj.A0R(from, viewGroup, R.layout.layout_cta_selector_action_bar, false));
    }

    public EnumC53102NeF(String str, int i, int i2) {
        this.A00 = i2;
    }
}
