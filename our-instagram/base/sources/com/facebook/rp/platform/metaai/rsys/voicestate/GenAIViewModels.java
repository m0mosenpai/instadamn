package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes9.dex */
public final class GenAIViewModels extends C0T6 {

    @SerializedName("imagine_view_model")
    public final ImagineViewModel imagineViewModel;

    @SerializedName("reels_view_model")
    public final ReelsViewModel reelsViewModel;

    @SerializedName("search_view_model")
    public final SearchViewModel searchViewModel;

    public final ImagineViewModel component1() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel component2() {
        return this.reelsViewModel;
    }

    public final SearchViewModel component3() {
        return this.searchViewModel;
    }

    public final GenAIViewModels copy(ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel) {
        return new GenAIViewModels(imagineViewModel, reelsViewModel, searchViewModel);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIViewModels) {
                GenAIViewModels genAIViewModels = (GenAIViewModels) obj;
                if (!C14360o3.A0K(this.imagineViewModel, genAIViewModels.imagineViewModel) || !C14360o3.A0K(this.reelsViewModel, genAIViewModels.reelsViewModel) || !C14360o3.A0K(this.searchViewModel, genAIViewModels.searchViewModel)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GenAIViewModels copy$default(GenAIViewModels genAIViewModels, ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            imagineViewModel = genAIViewModels.imagineViewModel;
        }
        if ((i & 2) != 0) {
            reelsViewModel = genAIViewModels.reelsViewModel;
        }
        if ((i & 4) != 0) {
            searchViewModel = genAIViewModels.searchViewModel;
        }
        return new GenAIViewModels(imagineViewModel, reelsViewModel, searchViewModel);
    }

    public final ImagineViewModel getImagineViewModel() {
        return this.imagineViewModel;
    }

    public final ReelsViewModel getReelsViewModel() {
        return this.reelsViewModel;
    }

    public final SearchViewModel getSearchViewModel() {
        return this.searchViewModel;
    }

    public int hashCode() {
        return (((AbstractC167017dG.A0M(this.imagineViewModel) * 31) + AbstractC167017dG.A0M(this.reelsViewModel)) * 31) + AbstractC166997dE.A0I(this.searchViewModel);
    }

    public GenAIViewModels(ImagineViewModel imagineViewModel, ReelsViewModel reelsViewModel, SearchViewModel searchViewModel) {
        this.imagineViewModel = imagineViewModel;
        this.reelsViewModel = reelsViewModel;
        this.searchViewModel = searchViewModel;
    }

    public String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("GenAIViewModels(imagineViewModel=");
        A1C.append(this.imagineViewModel);
        A1C.append(", reelsViewModel=");
        A1C.append(this.reelsViewModel);
        A1C.append(", searchViewModel=");
        return AbstractC167017dG.A0o(this.searchViewModel, A1C);
    }
}
