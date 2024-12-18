package X;

import com.instagram.creatortools.api.schemas.CreatorToolsComponent;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F1P {
    public static C25281BGw parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            CreatorToolsComponent creatorToolsComponent = null;
            MUD mud = null;
            MUD mud2 = null;
            E7j e7j = null;
            C51760Mtj c51760Mtj = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("component_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorToolsComponent = (CreatorToolsComponent) CreatorToolsComponent.A01.get(A1P);
                    if (creatorToolsComponent == null) {
                        creatorToolsComponent = CreatorToolsComponent.A0B;
                    }
                } else if ("cover_render_data".equals(A0s)) {
                    mud = F1G.parseFromJson(c16l);
                } else if ("eligibility_criteria_render_data".equals(A0s)) {
                    mud2 = F1N.parseFromJson(c16l);
                } else if ("footer_render_data".equals(A0s)) {
                    e7j = AbstractC33691Euf.parseFromJson(c16l);
                } else if ("render_position".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("value_prop_render_data".equals(A0s)) {
                    c51760Mtj = F1O.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (creatorToolsComponent == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("component_name", c16l, "ProductValueProps");
            } else if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("render_position", c16l, "ProductValueProps");
            } else {
                return new C25281BGw(c51760Mtj, mud, mud2, e7j, creatorToolsComponent, num.intValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
