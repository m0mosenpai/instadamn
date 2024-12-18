package X;

import android.graphics.Path;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vz3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69984Vz3 {
    public static C139136Ru parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C139136Ru c139136Ru = new C139136Ru();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("path_actions".equals(AbstractC166997dE.A0s(c16l))) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C139156Rw parseFromJson = AbstractC68588VWp.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c139136Ru.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c139136Ru;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C139136Ru c139136Ru) {
        anonymousClass182.A0d();
        if (c139136Ru.A00 != null) {
            C16V.A03(anonymousClass182, "path_actions");
            for (C139156Rw c139156Rw : c139136Ru.A00) {
                if (c139156Rw != null) {
                    anonymousClass182.A0d();
                    if (c139156Rw.A03 != null) {
                        anonymousClass182.A0r("move_to_action");
                        C139146Rv c139146Rv = c139156Rw.A03;
                        anonymousClass182.A0d();
                        anonymousClass182.A0P("action_x", c139146Rv.A00);
                        anonymousClass182.A0P("action_y", c139146Rv.A01);
                        anonymousClass182.A0a();
                    }
                    if (c139156Rw.A02 != null) {
                        anonymousClass182.A0r("line_to_action");
                        C139166Rx c139166Rx = c139156Rw.A02;
                        anonymousClass182.A0d();
                        anonymousClass182.A0P("action_x", c139166Rx.A00);
                        anonymousClass182.A0P("action_y", c139166Rx.A01);
                        anonymousClass182.A0a();
                    }
                    if (c139156Rw.A01 != null) {
                        anonymousClass182.A0r("close_action");
                        anonymousClass182.A0d();
                        anonymousClass182.A0a();
                    }
                    if (c139156Rw.A00 != null) {
                        anonymousClass182.A0r("add_round_rect_action");
                        C6S4 c6s4 = c139156Rw.A00;
                        anonymousClass182.A0d();
                        anonymousClass182.A0P("rect_left", c6s4.A03);
                        anonymousClass182.A0P("rect_top", c6s4.A05);
                        anonymousClass182.A0P("rect_right", c6s4.A04);
                        anonymousClass182.A0P("rect_bottom", c6s4.A02);
                        anonymousClass182.A0P("radius_x", c6s4.A00);
                        anonymousClass182.A0P("radius_y", c6s4.A01);
                        Path.Direction direction = c6s4.A06;
                        if (direction != null) {
                            anonymousClass182.A0S("orientation", direction.name());
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
