package X;

import android.content.Context;
import android.util.JsonWriter;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.tagging.model.TagSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Obc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55118Obc {
    public static final C55118Obc A00 = new Object();

    public static final String A01(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, List list, List list2) {
        boolean equals;
        if (list == list2) {
            equals = true;
        } else {
            equals = Arrays.equals(list.toArray(new com.instagram.tagging.model.Tag[0]), list2.toArray(new com.instagram.tagging.model.Tag[0]));
        }
        if (!equals) {
            try {
                ArrayList A002 = OQD.A00(list, list2);
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    AbstractC41775Ier.A06(userSession, c38321qM, interfaceC60442pS, AbstractC38048Gob.A01(((ProductTag) it.next()).A02));
                }
                return TagSerializer.A00(list2, A002);
            } catch (IOException e) {
                C0K8.A0F("EditMediaInfoUtil", AbstractC111324zv.A00(3798), e);
                return null;
            }
        }
        return null;
    }

    public static final C25621Ms A00(Context context, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, UserSession userSession, C51685MsG c51685MsG, C38321qM c38321qM, Venue venue, AudioOverlayTrack audioOverlayTrack, Boolean bool, String str, String str2, List list, List list2, int i, int i2) {
        String str3;
        List list3;
        String A14 = AbstractC25225BEi.A14();
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        AbstractC31173DnH.A1Q(A0c, "media/%s/edit_media/", MSY.A1b(c38321qM));
        A0c.A0H("caption_text", str);
        A0c.A9s(AbstractC50529MSi.A02(0, 9, 30), C16030qx.A00(context));
        A0c.A9s("inventory_source", c38321qM.A0C.BJN());
        A0c.A0F("is_carousel_bumped_post", bool);
        A0c.A0H("nav_chain", A14);
        A0c.A0P(null, N3N.class, C41349IRu.class, false);
        A0c.A0R = true;
        if (i != -1) {
            A0c.A9s("feed_position", String.valueOf(i));
        }
        if (i2 != -1) {
            A0c.A9s("carousel_index", String.valueOf(i2));
        }
        if (venue != null) {
            try {
                String A002 = AbstractC68553VVg.A00(venue);
                A0c.A9s("location", A002);
                if ("facebook_events".equals(venue.A03())) {
                    A0c.A9s("event", A002);
                }
            } catch (IOException e) {
                C0K8.A0F("EditMediaInfoUtil", "Unable to parse location", e);
            }
        }
        if (list != null) {
            A0c.A9s("carousel_children_media_ids_to_delete", AbstractC31175DnJ.A0b(list));
        }
        if (c38321qM.A0C.Ar6() != null) {
            A0c.A9s("include_unpublished", "true");
        }
        A0c.A9s("include_e2ee_mentioned_user_list", "true");
        if (list2 != null) {
            C44Q An4 = c38321qM.A0C.An4();
            if (An4 != null) {
                str3 = An4.C7K();
            } else {
                str3 = null;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list2) {
                AbstractC25228BEl.A1Q(obj, A1E, C14360o3.A0K(obj, str3) ? 1 : 0);
            }
            if (!AbstractC001800i.A0u(list2, str3) && str3 != null) {
                list3 = AbstractC166987dD.A1J(str3);
            } else {
                list3 = C16930sl.A00;
            }
            String str4 = null;
            if (!A1E.isEmpty() || !list3.isEmpty()) {
                try {
                    StringWriter A0O = AbstractC37300Gc1.A0O();
                    JsonWriter jsonWriter = new JsonWriter(A0O);
                    jsonWriter.beginObject();
                    if (AbstractC166987dD.A1b(A1E)) {
                        jsonWriter.name("added");
                        AbstractC53918Nsr.A00(jsonWriter, A1E);
                    }
                    if (AbstractC166987dD.A1b(list3)) {
                        jsonWriter.name("removed");
                        AbstractC53918Nsr.A00(jsonWriter, list3);
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    str4 = A0O.toString();
                } catch (IOException unused) {
                }
            }
            A0c.A9s("channel_tags", str4);
        }
        if (c51685MsG != null) {
            try {
                A0c.A9s("bio_product", OXq.A00(c51685MsG));
            } catch (IOException e2) {
                C0K8.A0F("EditMediaInfoUtil", "Unable to serialize bio product info", e2);
            }
        }
        if (audioOverlayTrack != null) {
            MusicProduct musicProduct = MusicProduct.A0G;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                if (str2 != null) {
                    A0c.AA6("music_params", AbstractC23129AMi.A04(AbstractC50522MSa.A0Y(musicProduct, audioOverlayTrack, musicAssetModel, str2)));
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                throw AbstractC166987dD.A14("Required value was null.");
            }
        }
        if (mediaGenAIDetectionMethod != null) {
            A0c.A9s("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
        }
        return A0c;
    }
}
