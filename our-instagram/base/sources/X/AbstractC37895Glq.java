package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Glq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37895Glq {
    public static MusicAssetModel parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            MusicAssetModel musicAssetModel = new MusicAssetModel();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                ArrayList arrayList = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                if (!"audio_asset_id".equals(A0q) && !PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if ("audio_cluster_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        musicAssetModel.A0B = str2;
                    } else if ("progressive_download_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        musicAssetModel.A0H = str3;
                    } else if ("dash_manifest".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        musicAssetModel.A0C = str4;
                    } else if ("highlight_start_times_in_ms".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                Integer valueOf = Integer.valueOf(c16l.A1D());
                                if (valueOf != null) {
                                    arrayList.add(valueOf);
                                }
                            }
                        }
                        musicAssetModel.A0J = arrayList;
                    } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        musicAssetModel.A0I = str5;
                    } else if ("ig_artist".equals(A0q)) {
                        Parcelable.Creator creator = User.CREATOR;
                        musicAssetModel.A06 = AbstractC38851rI.A00(c16l, false);
                    } else if ("display_artist".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str6 = c16l.A1P();
                        }
                        musicAssetModel.A0D = str6;
                    } else if ("artist_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str7 = c16l.A1P();
                        }
                        musicAssetModel.A0A = str7;
                    } else if ("cover_artwork_uri".equals(A0q)) {
                        musicAssetModel.A02 = AbstractC222616c.A00(c16l);
                    } else if ("cover_artwork_thumbnail_uri".equals(A0q)) {
                        musicAssetModel.A03 = AbstractC222616c.A00(c16l);
                    } else if ("duration_in_ms".equals(A0q)) {
                        musicAssetModel.A00 = c16l.A1D();
                    } else if ("is_explicit".equals(A0q)) {
                        musicAssetModel.A0S = c16l.A0d();
                    } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                        musicAssetModel.A0Q = c16l.A0d();
                    } else if ("is_eligible_for_vinyl_sticker".equals(A0q)) {
                        musicAssetModel.A0R = c16l.A0d();
                    } else if ("has_lyrics".equals(A0q)) {
                        musicAssetModel.A0O = c16l.A0d();
                    } else if ("is_original_sound".equals(A0q)) {
                        musicAssetModel.A0U = c16l.A0d();
                    } else if ("allows_saving".equals(A0q)) {
                        musicAssetModel.A0L = c16l.A0d();
                    } else if ("original_sound_media_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str8 = c16l.A1P();
                        }
                        musicAssetModel.A0G = str8;
                    } else if ("alacorn_session_id".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str9 = c16l.A1P();
                        }
                        musicAssetModel.A09 = str9;
                    } else if ("is_bookmarked".equals(A0q)) {
                        musicAssetModel.A0P = c16l.A0d();
                    } else if ("can_remix_be_shared_to_fb".equals(A0q)) {
                        musicAssetModel.A0M = c16l.A0d();
                    } else if ("can_remix_be_shared_to_fb_expansion".equals(A0q)) {
                        musicAssetModel.A0N = c16l.A0d();
                    } else if ("is_local_audio".equals(A0q)) {
                        musicAssetModel.A0T = c16l.A0d();
                    } else if ("local_audio_file_path".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str10 = c16l.A1P();
                        }
                        musicAssetModel.A0F = str10;
                    }
                } else {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    musicAssetModel.A0E = str;
                }
                c16l.A0z();
            }
            MusicAssetModel.A04(musicAssetModel);
            return musicAssetModel;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
