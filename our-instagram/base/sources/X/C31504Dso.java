package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Dso, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31504Dso {
    public static C31505Dsp parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C31505Dsp c31505Dsp = new C31505Dsp();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                if ("onboarding_checklist".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            FRF parseFromJson = F0U.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c31505Dsp.A03 = arrayList;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c31505Dsp.A02 = str2;
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c31505Dsp.A01 = str;
                } else if ("eligible_for_experience".equals(A0q)) {
                    c31505Dsp.A04 = c16l.A0d();
                } else if ("should_show_reminder".equals(A0q)) {
                    c31505Dsp.A05 = c16l.A0d();
                } else if ("nrux_account_type".equals(A0q)) {
                    EnumC31507Dsr enumC31507Dsr = (EnumC31507Dsr) EnumC31507Dsr.A01.get(Integer.valueOf(c16l.A1D()));
                    if (enumC31507Dsr == null) {
                        enumC31507Dsr = EnumC31507Dsr.A07;
                    }
                    c31505Dsp.A00 = enumC31507Dsr;
                } else if (!"total_days".equals(A0q) && !"current_day".equals(A0q)) {
                    C55702hA.A01(c16l, c31505Dsp, A0q);
                } else {
                    c16l.A1D();
                }
                c16l.A0z();
            }
            return c31505Dsp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
